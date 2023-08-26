package com.company;

import com.company.library.Book;
import com.company.library.BookStorage;
import com.company.person.Employee;
import com.company.person.ListOfEmployee;
import com.company.person.ListOfVisitor;
import com.company.person.Visitor;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("მეფე ლირი","შექსპირი",123);
        Book book1 = new Book("მეფე ლირი","შექსპირი",123);
        Book book2 = new Book("მესი","კოლი",229);

        Employee employee = new Employee("123456","ki","na",20,990);
        Visitor visitor  = new Visitor("2345234","ab","li",31,342);

        BookStorage.addBook(book);
        BookStorage.addBook(book1);
        BookStorage.addBook(book2);

        ListOfEmployee.addEmployee(employee);
        ListOfVisitor.addVisitor(visitor);

    }
}
