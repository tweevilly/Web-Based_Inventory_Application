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
            line 78 
        Added 5 sample parts 
            lines 78-110 
        Added If-statement to prevent overwriting of products 
        Added 5 sample products 
            lines 112-124 
## Task F
## Task G
## Task H
## Task I
