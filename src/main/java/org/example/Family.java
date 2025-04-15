package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        this.children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        if (children == null || children.length == 0) return false;

        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                for (int j = i; j < children.length - 1; j++) {
                    children[j] = children[j + 1];
                }
                children = Arrays.copyOf(children, children.length - 1);
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (children == null || index < 0 || index >= children.length) return false;

        for (int i = index; i < children.length - 1; i++) {
            children[i] = children[i + 1];
        }
        children = Arrays.copyOf(children, children.length - 1);
        return true;
    }

    public int countFamily() {
        int total = 2 + children.length;
        if (pet != null) total++;
        return total;
    }


    @Override
    public String toString() {
        return "Family{\n" +
                " mother=" + mother +
                ",\n father=" + father +
                ",\n children=" + Arrays.toString(children) +
                ",\n pet=" + pet +
                "\n}";
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

    @Override
    protected void finalize() {
        System.out.println("Family object destroyed.");
    }
}
