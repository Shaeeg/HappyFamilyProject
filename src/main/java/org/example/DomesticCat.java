package org.example;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname) {
        super(nickname);
        this.species = Species.DOMESTIC_CAT;
    }

    @Override
    public void respond() {
        System.out.println(nickname + " (Cat): Meow!");
    }

    @Override
    public void foul() {
        System.out.println(nickname + " scratched the couch!");
    }
}
