# Web-Based Spring Inventory Application

A web-based inventory management application for a small retail shop. It tracks parts and products, letting a user add, update, and delete both, associate parts with products, and purchase products (decrementing inventory). Inventory changes are validated against per-part minimum and maximum thresholds.

Built as a **WGU Course D287: Java Frameworks** project, with Spring Boot, Thymeleaf, and Spring Data JPA (H2 database).

---

## Features

- Create, update, and delete parts (in-house and outsourced) and products
- Associate parts with products
- Buy Now button that decrements a product's inventory by one and shows a success or failure page
- Minimum and maximum inventory per part, with validation and error messages when an add or update would break either limit, including when a product change would drop a part below its minimum
- Custom validators (ValidInventory, EnufPartsValidator) for those rules
- Sample inventory (five parts, five products) loaded at startup without overwriting existing data
- Shop-branded main screen and an About page
- Unit tests for the minimum and maximum inventory fields (PartTest)

---

## Tech Stack

- Java 17
- Spring Boot, Spring MVC, Thymeleaf
- Spring Data JPA with an H2 database
- Maven
- JUnit

---

## Prerequisites

- JDK 17
- Maven 3.6+ installed and available on your PATH

---

## Running the app

``` bash
mvn spring-boot
```
Then open http://localhost:8080 in a browser.

---

## Running the tests

```bash
mvn test
```

---

## Where to find each change

Notes for each course task (B through J), with file names, line numbers, and the change made, are in TASK_NOTES.md. Line numbers match the code at the time of writing and may have drifted since.
