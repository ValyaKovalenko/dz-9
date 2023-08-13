package org.example;
public class Woman extends Person {
    private String partnerLastName;
    private String initialLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age, "female");
        this.initialLastName = lastName;
    }

    // Метод повернення прізвища до початкового прізвища
    private void revertToInitialLastName() {
        setLastName(initialLastName);
    }

    // Геттер та сеттер для partnerLastName
    public String getPartnerLastName() {
        return partnerLastName;
    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }

    // Метод для розірвання партнерства (повернення до попереднього прізвища)
    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (returnToPreviousLastName) {
            revertToInitialLastName();
        }
        setPartnerLastName(null);
    }
}
