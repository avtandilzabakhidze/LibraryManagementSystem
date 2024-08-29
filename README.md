# Library Management System

This project implements a simple library management system in Java. It includes classes to manage books, employees, visitors, and book transactions.

## Project Structure

The project is structured into several packages:

- **`com.company.library`**: Contains classes related to book management.
- **`com.company.person`**: Includes classes for managing employees and visitors.
- **`com.company.taken`**: Contains classes for managing book transactions.

### Book Management
- **`Book`**: Represents a book with attributes such as title, author, and ID.
- **`BookStorage`**: Manages a collection of books and provides methods to add, remove, and retrieve books.

### Person Management
- **`Person`**: Represents a person with attributes such as personal number, first name, last name, and age.
- **`Employee`**: Represents an employee with additional attributes such as employee ID.
- **`ListOfEmployee`**: Manages a list of employees and provides methods to add and remove employees.
- **`ListOfVisitor`**: Manages a list of visitors and provides methods to add and remove visitors.

### Book Transactions
- **`TakenBook`**: Manages book transactions, including the borrowing and returning of books by visitors.

## Features

- **Book Management**: Allows adding, removing, and retrieving books.
- **Employee Management**: Supports adding and removing employees.
- **Visitor Management**: Supports adding and removing visitors.
- **Book Transactions**: Tracks books borrowed and returned by visitors.

## Usage

1. Add books to the library using `BookStorage`.
2. Manage employees and visitors using `ListOfEmployee` and `ListOfVisitor`.
3. Track book transactions using `TakenBook`.

## Additional Functionality

- **Sorting Employees by Name**: The system provides functionality to sort employees by their first name.

