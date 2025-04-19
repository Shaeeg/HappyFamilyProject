package org.example;

public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    FISH(false, 0, false),
    HAMSTER(false, 4, true),
    PARROT(true, 2, true),
    PLATYPUS(false, 4, true),
    RABBIT(false, 2, true),
    TURTLE(false, 4, false),
    DOMESTIC_CAT(false, 4, true),
    ROBO_CAT(true, 4, false),
    UNKNOWN(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int numberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }

    @Override
    public String toString() {
        return name() + "{canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", hasFur=" + hasFur + '}';
    }

}
