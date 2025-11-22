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
    
    mainscreen.html
        Added Buy now button, added mapping tag to buyProduct
            -Lines 108
    Success.html
        Created html page to display success of product purchase
            -Lines 1-24
        Added link back to main page
            -Line 22
    Failure.html
        Created html page to display failure of product purchase
            -Lines 1-24
        Added link back to main page
            -Line 22
    AddProductController.java
        Added buyProduct method 
            -Lines 180-204
        Created if-statement to check inv value
            -Lines 193-204
        Added code to decrement inv value
            -Lines 198-202
## Task G
Modify the parts to track maximum and minimum inventory by doing the following: <br>
Add additional fields to the part entity for maximum and minimum inventory. <br>
Modify the sample inventory to include the maximum and minimum fields. <br>
Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values. <br>
Rename the file the persistent storage is saved to. <br>
Modify the code to enforce that the inventory is between or at the minimum and maximum value. <br>

    Part.java
        Created min and max variables 
            -Lines 31-34
        Created getters and setters for min and max 
            -Lines 97-110
    mainscreen.html
        Added min and max inventory table headers
            -Lines 61-62
        Added min and max columns
    BootStrapData.java 
        Added values for min and max to all parts
            -Lines 86-87. 94-95. 102-103. 110-111. 118-119.
    application.properties
        Renamed the file the persistent storage is saved to
            -Line 6
    InhousepartForm.html
        Added to the InhousePartForm additional texts for user min and max values update
            -Lines -36-50
    OutSourcedPartForm.html
        Added to the OutSourcedPartForm additional texts for user min and max values update
            -Lines -36-51
    InventoryValidator.java
        Created InventoryValidator class
        Changed interface name to ValidInventory
            -line 19
    ValidInventory.java
        Created ValidInventory interface coinciding with validator class
        Changed validated by to InventoryValidator,class
            -Line 16
        Added if-statement to enforce inv between min and max
            -Lines 32-39
## Task H
Add validation for between or at the maximum and minimum fields. <br>
Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts. <br>
Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum. <br>
Display error messages when adding and updating parts if the inventory is greater than the maximum. <br>

    productForm.html
        Added link to main page
            -Line 75
    EnufPartsValidator.java
            -Added high/low inv and added error messages
            -Lines 39-61
## Task I
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package. <br>
    
    PartTest.java
        Added two unit test verifying minInv and maxInv work
            -Line 160-176
## Task J
Remove the class files for any unused validators in order to clean your code.
    
    Deleted DeletePartValidator.java - 0 usage
    Deleted ValidDeletePart.java - corresponding interface of DeletePartValidator.java