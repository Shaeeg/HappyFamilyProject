package org.example;

import java.util.Arrays;
import java.util.Random;

public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
    }

    public Human(){}

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(){
        String sly;
        if(pet.getTrickLevel() > 50){
            sly = "very sly";
        }
        else{
            sly = "almost not sly";
        }
        if(pet.getTrickLevel() != 0 && pet.getAge() != 0){
            System.out.printf("I have an %s which is %d years old, he is %s.\n", pet.getSpecies(), pet.getAge(), sly);
        }
        else{
            System.out.println("I have an " + pet.getSpecies());
        }
    }

    public boolean feedPet(boolean isTime){
        int rand;
        {
            Random random = new Random();
            rand = random.nextInt(100) + 1;
        }
        if(isTime){
            System.out.printf("%s feeds the pet.\n", this.name);
        }
        else if(pet.getTrickLevel() > rand){
            System.out.printf("I think %s is not hungry", pet.getNickname());
        }
        else{
            System.out.printf("%s feeds the pet.\n", this.name);
        }
        return isTime;
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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
