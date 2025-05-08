package org.example;

import java.util.*;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;
    private static final String[] MALE_NAMES = {"Ali", "Shaiq", "Omar", "Nihad"};
    private static final String[] FEMALE_NAMES = {"Nuray", "Nigar", "Zeyneb", "Zehra"};


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pets = new HashSet<>();
        this.mother.setFamily(this);
        this.father.setFamily(this);

        if (mother.getPet() != null) {
            children.forEach(mother::assignPetToChild);
        }
        if (father.getPet() != null) {
            children.forEach(father::assignPetToChild);
        }
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);

        if(child.getYear() == 0){
            child.setYear(mother.getYear() + 1);
        }
    }

    public boolean deleteChild(Human child) {
        if (children == null || children.isEmpty()) return false;
        boolean removed = children.remove(child);
        if (removed) child.setFamily(null);
        return removed;
    }


    public boolean deleteChild(int index) {
        if (children == null || index < 0 || index >= children.size()) return false;

        children.remove(index);
        return true;
    }

    public int countFamily() {
        int total = 2 + children.size();
        if (pets != null) total = total + pets.size();
        return total;
    }

    public Human bornChild(Man father, Woman mother) {
        Random rand = new Random();
        String gender = rand.nextBoolean() ? "male" : "female";
        int iq = (father.iq + mother.iq) / 2;
        String surname = father.surname;
        int year = mother.getYear() + 1;

        Human child;
        if (gender.equals("male")) {
            String name = MALE_NAMES[rand.nextInt(MALE_NAMES.length)];
            child = new Man(name, surname, year, iq, null);  // Pet will be assigned later
        } else {
            String name = FEMALE_NAMES[rand.nextInt(FEMALE_NAMES.length)];
            child = new Woman(name, surname, year, iq, null);  // Pet will be assigned later
        }

        if (father.getPet() != null) {
            child.setPet(father.getPet());
        } else if (mother.getPet() != null) {
            child.setPet(mother.getPet());
        }

        return child;
    }

    @Override
    public String toString() {
        return "Family{\n" +
                " mother=" + mother + ",\n" +
                " father=" + father + ",\n" +
                " children=" + children + ",\n" +
                " pets=" + (pets.isEmpty() ? "No pets" : pets) + "\n}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    // Static and non-static initialization blocks
    static {
        System.out.println("Family class loaded.");
    }

    {
        System.out.println("New Family object created.");
    }

}
