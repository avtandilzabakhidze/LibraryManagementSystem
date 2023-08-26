package com.company.person;

public class Visitor extends Person {
    private final int VisitorId;

    public Visitor(String personalNo, String firstName, String lastName, int age, int visitorId) {
        super(personalNo, firstName, lastName, age);
        VisitorId = visitorId;
    }

    public int getVisitorId() {
        return VisitorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Visitor visitor = (Visitor) o;

        return VisitorId == visitor.VisitorId;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + VisitorId;
        return result;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "VisitorId=" + VisitorId +
                '}';
    }
}
