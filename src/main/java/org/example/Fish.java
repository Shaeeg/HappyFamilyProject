package org.example;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(nickname);
        this.species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " (Fish): *blub blub*");
    }
}
