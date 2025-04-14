package org.example;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Doberman", "Jake");
        Human mother = new Human("Jane", "Watson", 1989, 90, pet);
        Human father = new Human("Hugh", "Brown", 1988, 90, pet);

    }
}
