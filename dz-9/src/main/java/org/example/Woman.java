package org.example;
public class Woman extends Person {
    private String partnerLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age, "female");
    }

    // Геттер та сеттер для partnerLastName
    public String getPartnerLastName() {
        return partnerLastName;
    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }

    // Метод для розірвання партнерства (повернення до попереднього прізвища)
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (returnToPreviousLastName) {
            Man partner = new Man("", partnerLastName, 0);
            setLastName(partner.getLastName());
            partner.setLastName(partnerLastName);
        }
        setPartnerLastName(null);
    }
}
