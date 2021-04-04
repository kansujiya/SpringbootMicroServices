package com.spring.microservice.models;

public class PersonV2 {
    private PersonName personName;

    public PersonV2() {
    }

    public PersonV2(PersonName personName) {
        this.personName = personName;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }
}
