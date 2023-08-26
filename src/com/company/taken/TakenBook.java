package com.company.taken;

import com.company.library.Book;
import com.company.person.Employee;
import com.company.person.ListOfEmployee;
import com.company.person.Visitor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TakenBook {
   public static Map<Visitor, Book> visitorTakenBooks = new HashMap<>();

   //ერთ ვიზიტორს შეუძლია მხოლოდ ერთი წიგნის წაღება
   public static void take(Visitor visitor,Book book){
       if (visitorTakenBooks.containsKey(visitor)){
           System.out.println("მომხმარებელმა უკვე წაიღო წიგნი .");
       }else {
           visitorTakenBooks.put(visitor, book);
       }
   }

   public static void returnBook(Visitor visitor){
        if (visitorTakenBooks.containsKey(visitor)){
            visitorTakenBooks.remove(visitor);
        }else {
            System.out.println("ამ ადამიანს წიგნი არ აქვს წაღებული");
        }
    }

    public static List<Employee> sortEmployeeName(){
        List<Employee> employees = ListOfEmployee.employees;
        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());
        return collect;
    }


}
