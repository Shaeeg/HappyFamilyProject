package org.example;

public final class Woman extends Human {
    public Woman(String name, String surname, int iq, Pet pet) {
        super(name, surname, iq, pet);
    }

    @Override
    public void greetPet() {
        if (pet != null)
            System.out.println("Hello my lovely " + pet.nickname + "!");
        else
            System.out.println("Where's my little cutie?");
    }

    public void makeup() {
        System.out.println(name + " is doing makeup.");
    }
}
