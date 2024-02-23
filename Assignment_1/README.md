# OOP_II_Java
Object Oriented Programming II- Java

# Real Estate Management Application - Complaint Management Module

## Developed by Group 22: 
- 1. RICHARD KARANU MBUTI - SCT212-0062/2019
- 2. Teresiah Njeri- SCT212-0133/2022
- 3. Vanessa Kalondu - SCT212-0159/2022
- 4. Nimrod Mutisya-SCT212-0709/2022
- 5. Viona Njenga - SCT212-0577/2022


This document outlines the design and implementation of the Complaint Management Module for our Real Estate Management Application. Utilizing Java's Object-Oriented Programming (OOP) principles, we've created a robust system that handles the submission, tracking, and resolution of complaints related to real estate properties.

### Module Overview

The Complaint Management Module provides functionalities for reporting, managing, and resolving complaints. It is designed to enhance communication between property managers and tenants, ensuring that issues are addressed efficiently and effectively.

### Design Principles

Our implementation leverages core OOP concepts, including:

- **Encapsulation**: By defining classes that encapsulate data and behavior, we ensure that the internal representation of each object is hidden from the outside, only exposing operations in a controlled manner.
- **Inheritance**: While our current implementation focuses on a single `Complaint` class, the system is designed to be extensible, allowing for the creation of specialized complaint types in the future.
- **Interfaces**: The `ComplaintManagement` interface abstracts the operations associated with complaint handling, allowing for flexible implementations.
- **Collections**: We utilize various collections, such as `ArrayList`, `LinkedList`, and `HashMap`, to manage and organize complaints effectively.

### Core Components

- **`Complaint` Class**: Represents a single complaint, encapsulating relevant details such as the complaint ID, description, submitter, and status.
- **`ComplaintManagement` Interface**: Defines the contract for managing complaints, including adding, retrieving, updating, and filtering operations.
- **`ComplaintRepository` Class**: Implements the `ComplaintManagement` interface, using a combination of `HashMap` and `LinkedList` to store and manage complaints efficiently.

### Implementation Highlights

- The `Complaint` class uses private fields and public getter/setter methods, following the encapsulation principle to safeguard data integrity.
- The `ComplaintManagement` interface allows for decoupling the complaint management operations from their actual implementation, providing flexibility and scalability.
- By employing a `HashMap`, the `ComplaintRepository` enables efficient complaint retrieval by ID, while a `LinkedList` maintains the order of complaints, facilitating operations that require chronological ordering.

### Conclusion

The Complaint Management Module exemplifies the application of OOP principles in building a scalable, maintainable, and efficient system. By adhering to these principles, our module not only ensures robust data handling and operation flexibility but also lays the groundwork for future enhancements and integrations within the Real Estate Management Application.

