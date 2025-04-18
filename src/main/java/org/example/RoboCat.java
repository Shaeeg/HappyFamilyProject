package org.example;

public class RoboCat extends Pet {
    public RoboCat(String nickname) {
        super(nickname);
        this.species = Species.ROBO_CAT;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " (RoboCat): Beep Meow!");
    }
}
