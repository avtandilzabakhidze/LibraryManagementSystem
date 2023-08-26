package com.company.person;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployee {
    public static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee employee){
        if (!employees.contains(employee)){
            employees.add(employee);
        }else{
            System.out.println("ასეთ თანამშრომელი უკვე სიაშია .");
        }
    }
    public static void removeEmployee(Employee employee){
        if (employees.contains(employee)){
            employees.remove(employee);
        }else {
            System.out.println("ასეთ თანამშრომელი სიაში არაა.");
        }
    }
}
