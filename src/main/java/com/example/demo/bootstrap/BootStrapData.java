package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override


    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

        //object from parts class
        if (partRepository.count() == 0) {

            Part p1 = new InhousePart();
            p1.setName("Wire Mixer");
            p1.setPrice(29.99);
            p1.setInv(10);
            p1.setMinInv(1);
            p1.setMaxInv(50);
            partRepository.save(p1);

            Part p2 = new InhousePart();
            p2.setName("Coated Flat Beater");
            p2.setPrice(22.79);
            p2.setInv(10);
            p2.setMinInv(1);
            p2.setMaxInv(50);
            partRepository.save(p2);

            Part p3 = new InhousePart();
            p3.setName("Dough Hook");
            p3.setPrice(29.99);
            p3.setInv(10);
            p3.setMinInv(1);
            p3.setMaxInv(50);
            partRepository.save(p3);

            InhousePart p4 = new InhousePart();
            p4.setName("Flat Edge Beater");
            p4.setPrice(29.99);
            p4.setInv(10);
            p4.setMinInv(1);
            p4.setMaxInv(50);
            partRepository.save(p4);

            InhousePart p5 = new InhousePart();
            p5.setName("5-Qt Stainless Steel Mixer");
            p5.setPrice(69.99);
            p5.setInv(10);
            p5.setMinInv(1);
            p5.setMaxInv(50);
            partRepository.save(p5);

        }
        //object from product class
        if (productRepository.count() == 0) {
            Product prod1 = new Product("Stand Mixer", 299.99, 8);
            Product prod2 = new Product("Blender", 129.99, 15);
            Product prod3 = new Product("Food Processor", 199.99, 12);
            Product prod4 = new Product("Hand Mixer", 59.99, 20);
            Product prod5 = new Product("Coffee Maker", 99.99, 10);

            productRepository.save(prod1);
            productRepository.save(prod2);
            productRepository.save(prod3);
            productRepository.save(prod4);
            productRepository.save(prod5);
        }



    }
}
