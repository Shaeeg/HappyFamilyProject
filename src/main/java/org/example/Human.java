package org.example;

import java.util.*;

public abstract class Human {
    protected String name;
    protected String surname;
    private int year;
    protected int iq;
    protected Pet pet;
    Map<DaysOfWeek, String> schedule;
    private Family family;

    public Human(String name, String surname, int year, int iq, Map<DaysOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = (schedule == null) ? new HashMap<>() : schedule;
    }

    public Human(String name, String surname, int year, int iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
    }

    public Human(String name, String surname, int iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.pet = pet;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {
    }


    public abstract void greetPet();

    public void describePet() {
        if (family != null && family.getPets() != null) {
            for (Pet pet : family.getPets()) {
                String sly = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
                System.out.printf("I have a %s who is %d years old, and he is %s.\n", pet.getSpecies(), pet.getAge(), sly);
            }
        }
    }

    public boolean feedPet(boolean isTime) {
        if (family == null || family.getPets() == null) return false;

        for (Pet pet : family.getPets()) {
            int chance = (int) (Math.random() * 100);
            if (isTime || pet.getTrickLevel() > chance) {
                System.out.printf("%s feeds the pet.\n", this.name);
                return true;
            } else {
                System.out.printf("I think %s is not hungry.\n", pet.getNickname());
                return false;
            }
        }
        return false;
    }

    public void assignPetToChild(Human child) {
        if (child.getPet() == null) {
            if (this.pet != null) {
                child.setPet(this.pet);
            }
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Map<DaysOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DaysOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + (pet != null ? pet.getNickname() : "No pet") +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    {
        System.out.println("New Human object created.");
    }

    static {
        System.out.println("Human class loaded.");
    }

}
