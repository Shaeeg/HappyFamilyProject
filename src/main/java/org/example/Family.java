package org.example;

import java.util.Random;

public class Family implements HumanCreator {
    private static final String[] MALE_NAMES = {"Ali", "Shaiq", "Omar", "Nihad"};
    private static final String[] FEMALE_NAMES = {"Nuray", "Nigar", "Zeyneb", "Zehra"};

    @Override
    public Human bornChild(Man father, Woman mother) {
        Random rand = new Random();
        String gender = rand.nextBoolean() ? "male" : "female";
        int iq = (father.iq + mother.iq) / 2;
        String surname = father.surname;

        if (gender.equals("male")) {
            String name = MALE_NAMES[rand.nextInt(MALE_NAMES.length)];
            return new Man(name, surname, iq, null);
        } else {
            String name = FEMALE_NAMES[rand.nextInt(FEMALE_NAMES.length)];
            return new Woman(name, surname, iq, null);
        }
    }
}
