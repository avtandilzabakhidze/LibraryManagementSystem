package com.company.person;

import java.util.ArrayList;
import java.util.List;

public class ListOfVisitor {
    public static List<Visitor> visitors = new ArrayList<>();

    public static void addVisitor(Visitor visitor){
        if (!visitors.contains(visitor)){
            visitors.add(visitor);
        }else{
            System.out.println("ასეთ ვიზიტორი უკვე სიაშია .");
        }
    }
    public static void removeVisitor(Visitor visitor){
        if (visitors.contains(visitor)){
            visitors.remove(visitor);
        }else {
            System.out.println("ასეთ ვიზიტორი სიაში არაა.");
        }
    }
}
