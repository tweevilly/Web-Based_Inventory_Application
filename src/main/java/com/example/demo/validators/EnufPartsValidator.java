package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;

    @Override
    public void initialize(ValidEnufParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        //Don't validate if context not available
        if(context==null) return true;
        if(context!=null)myContext=context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        constraintValidatorContext.disableDefaultConstraintViolation();
        //if product exists, compare old and new inventory
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            //changeInv = newInv - oldInv
            int change = product.getInv() - myProduct.getInv();
            //If product inv is increasing ensure each part has enough stock
            if (change > 0) {
                for(Part part : myProduct.getParts()) {
                    if (part.getInv() - change < part.getMinInv()) {
                        constraintValidatorContext.buildConstraintViolationWithTemplate(
                        "Not enough inventory for part: " + part.getName()).addConstraintViolation();
                        return false;
                    }
                }
            }
            return true;
        }

        for (Part part : product.getParts()) {
            if (part.getInv() - product.getInv() < part.getMinInv() ) {
                constraintValidatorContext.buildConstraintViolationWithTemplate(
                        "Not enough inventory for part: " + part.getName()).addConstraintViolation();
                return false;
            }
        }
        return true;
    }

}
