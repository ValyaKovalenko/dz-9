package org.example;

public class Man extends Person {

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age, "male");
    }

    // Метод для реєстрації партнерства (дружина приймає прізвище чоловіка)
    public void registerPartnership(Woman woman) {
        woman.setLastName(getLastName());
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {

    }

}
