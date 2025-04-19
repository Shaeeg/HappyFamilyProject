package org.example;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex");
        Pet cat = new DomesticCat("Mimi");

        Man father = new Man("Ali", "Huseynov", 110, dog);
        Woman mother = new Woman("Leyla", "Huseynova", 120, cat);

        father.greetPet();
        father.repairCar();

        mother.greetPet();
        mother.makeup();


        dog.eat();
        dog.respond();
        dog.foul();

        Family family = new Family(null, null);
        Human child = family.bornChild(father, mother);

        System.out.println("Child born: " + child.name + " " + child.surname + ", IQ: " + child.iq);
        child.greetPet();
    }
}