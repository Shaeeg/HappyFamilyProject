package org.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Step 1: Create some pets
        Pet dog = new Dog("Buddy");
        Pet cat = new DomesticCat("Whiskers");
        Pet fish = new Fish("Goldie");
        Pet roboCat = new RoboCat("RoboWhiskers");

        // Step 2: Create humans (mother and father)
        Man father = new Man("Ali", "Mustafa", 1990, 120, dog);
        Woman mother = new Woman("Zehra", "Aliyeva", 1992, 110, cat);

        // Step 3: Create a family
        Family family = new Family(mother, father);

        // Step 4: Add children to the family
        Human child1 = family.bornChild(father, mother); // Random child (gender based)
        family.addChild(child1);

        // Add a child manually
        Human child2 = new Man("Shaiq", "Aliyev", 2025, 100, null);
        family.addChild(child2);

        // Step 5: Print family details
        System.out.println(family);

        // Step 6: Describe the pet and feed the pet
        System.out.println("Describing pets:");
        mother.describePet();
        father.describePet();

        // Step 7: Test feeding pets
        mother.feedPet(true);  // Pet feeding when it's time
        father.feedPet(false); // Pet feeding when it's not time

        // Step 8: Test greeting pets
        father.greetPet();
        mother.greetPet();

        // Step 9: Test foul behavior for pets
        cat.foul();  // Pet makes a mess
        fish.foul();
        roboCat.foul();

        // Step 10: Remove a child from the family
        family.deleteChild(child2); // Remove child by object
        System.out.println(family);

        // Step 11: Test child deletion by index
        family.deleteChild(0); // Remove the first child (index 0)
        System.out.println(family);

        // Step 12: Count family members after removal
        System.out.println("Family count: " + family.countFamily());

        // Step 13: Create a new RoboCat and interact with it
        Pet newRoboCat = new RoboCat("RoboMeow");
        newRoboCat.respond();
        newRoboCat.foul();
    }
}