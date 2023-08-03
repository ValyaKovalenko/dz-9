package org.example;

public class Man extends Person {
    private String partnerLastName;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age, "male");
    }

    // Геттер та сеттер для partnerLastName
    public String getPartnerLastName() {
        return partnerLastName;
    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }

    // Метод для реєстрації партнерства (дружина приймає прізвище чоловіка)
    public void registerPartnership(Woman woman) {
        woman.setLastName(getLastName());
        setPartnerLastName(woman.getLastName());
    }

    // Метод для розірвання партнерства (повернення до попереднього прізвища)
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (returnToPreviousLastName) {
            Woman partner = new Woman("", partnerLastName, 0);
            setLastName(partner.getLastName());
            partner.setLastName(partnerLastName);
        }
        setPartnerLastName(null);
    }

}
