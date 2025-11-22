# WESTERN GOVERNORS UNIVERSITY 
**D287 – JAVA FRAMEWORKS**
Task 1: Web-Based Spring Inventory Application

## Task B
Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. 
Each note should include the prompt, file name, line number, and change.

## Task C
Customize the HTML user interface for your customer’s application. <br>
The user interface should include the shop name, the product names, and the names of the parts. <br>

    mainscreen.html
        Added customization 
            -lines 14-37 
        Added shop name 
            -line 42 
        Added product names 
        Added parts names 
## Task D
Add an “About” page to the application to describe your chosen customer’s company to web viewers <br>
and include navigation to and from the “About” page and the main screen <br>

    about.html
        Created about page 
        Added customization 
            - lines 5-12 
        Added shop description 
            -lines 18-23 
        Added link to mainscreen 
            -line 25   
    AboutController.java
        Created AboutController class <break>
        Added @GetMapping("/about") method 
            -lines 7-11 
    mainscreen.html
        Added button to about page 
            -line 55 
## Task E
Add a sample inventory appropriate for your chosen store to the application. <br>
You should have five parts and five products in your sample inventory and should not overwrite existing data in the database. <br>
    
    BootStrapData.java
        Added if-statement to prevent overwriting of parts 
            -line 78 
        Added 5 sample parts 
            -lines 78-110 
        Added If-statement to prevent overwriting of products 
        Added 5 sample products 
            -lines 112-124 
## Task F
Add a “Buy Now” button to your product list. <br>
The “Buy Now” button must be next to the buttons that update and delete products. <br>
The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts. <br>
Display a message that indicates the success or failure of a purchase. <br>

## Task G
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
## Task H
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
## Task I
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
## Task J
Remove the class files for any unused validators in order to clean your code.