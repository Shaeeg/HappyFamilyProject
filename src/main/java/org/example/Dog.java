package org.example;

public class Dog extends Pet implements Foulable {
    public Dog(String nickname) {
        super(nickname);
        this.species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " (Dog): Woof!");
    }

    @Override
    public void foul() {
        System.out.println(nickname + " made a mess!");
    }
}
