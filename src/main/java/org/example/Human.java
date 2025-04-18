package org.example;

public abstract class Human {
    protected String name;
    protected String surname;
    protected int iq;
    protected Pet pet;

    public Human(String name, String surname, int iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.pet = pet;
    }

    public abstract void greetPet();
}
