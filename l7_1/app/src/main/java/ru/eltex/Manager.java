package ru.eltex;

public class Manager extends User {
    private int stage;

    Manager(String firstName, String lastName, int stage) {
        super(firstName, lastName);
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "stage=" + stage +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
