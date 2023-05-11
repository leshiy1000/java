package ru.eltex;

public class Coder extends User {
    boolean work;

    Coder(String firstName, String lastName, boolean work) {
        super(firstName, lastName);
        this.work = work;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "work=" + work +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
