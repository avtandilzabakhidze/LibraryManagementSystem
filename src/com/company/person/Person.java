package com.company.person;

import java.util.Objects;

public class Person {
    private final String personalNo;
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String personalNo, String firstName, String lastName, int age) {
        this.personalNo = personalNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getPersonalNo() {
        return personalNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(personalNo, person.personalNo)) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        return Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int result = personalNo != null ? personalNo.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personalNo='" + personalNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
