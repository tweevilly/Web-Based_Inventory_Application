# WESTERN GOVERNORS UNIVERSITY 
**D287 – JAVA FRAMEWORKS**
Task 1: Web-Based Spring Inventory Application

## Task B
Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. 
Each note should include the prompt, file name, line number, and change.

## Task C
Customize the HTML user interface for your customer’s application. <br>
The user interface should include the shop name, the product names, and the names of the parts. <br>

    **mainscreen.html** <br
        Added customization <br>
            -lines 14-37 <br>
        Added shop name <br>
            -line 42 <br>
        Added product names <br>
        Added parts names <br>
## Task D
Add an “About” page to the application to describe your chosen customer’s company to web viewers <br>
and include navigation to and from the “About” page and the main screen <br>

    **about.html** <br>
        Created about page <br>
        Added customization <br>
            - lines 5-12 <br>
        Added shop description <br>
            -lines 18-23 <br>
        Added link to mainscreen <br>
            -line 25 <br>     
    **AboutController.java** <br>
        Created AboutController class <break>
        Added @GetMapping("/about") method <br>
            -lines 7-11 <br>
    **mainscreen.html** <br>
        Added button to about page <br>
            -line 55 <br>
## Task E
Add a sample inventory appropriate for your chosen store to the application. <br>
You should have five parts and five products in your sample inventory and should not overwrite existing data in the database. <br>
    
    **BootStrapData.java** <br>
        Added if-statement to prevent overwriting of parts <br>
            line 78 <br>
        Added 5 sample parts <br>
            lines 78-110 <br>
        Added If-statement to prevent overwriting of products <br>
        Added 5 sample products <br>
            lines 112-124 <br>
## Task F
## Task G
## Task H
## Task I
