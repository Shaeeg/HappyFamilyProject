package org.example;

public abstract class Pet {
    protected String nickname;
    protected Species species;

    public Pet(String nickname) {
        this.nickname = nickname;
        this.species = Species.UNKNOWN; // Default
    }

    public void eat() {
        System.out.println(nickname + " is eating.");
    }

    public abstract void respond();
}
