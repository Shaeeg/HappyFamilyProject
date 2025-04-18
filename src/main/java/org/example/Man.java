package org.example;

public final class Man extends Human {
    public Man(String name, String surname, int iq, Pet pet) {
        super(name, surname, iq, pet);
    }

    @Override
    public void greetPet() {
        if (pet != null)
            System.out.println("Hey bro, how's my buddy " + pet.nickname + "?");
        else
            System.out.println("Hey bro, where's my pet?");
    }

    public void repairCar() {
        System.out.println(name + " is repairing the car.");
    }
}
