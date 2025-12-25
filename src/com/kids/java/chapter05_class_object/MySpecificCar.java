package com.kids.java.chapter05_class_object;

/*
 * 🏎️ CHAPTER 4: The Real Thing (The Object)
 * 
 * Now we use our Blueprint (Class) to build REAL cars!
 * 
 * In Java, when we build something from a Class, we call it an 'Object'.
 * 
 * We can use the SAME blueprint to build MANY different cars.
 * One could be red, another blue, another fast, and another slow!
 */

public class MySpecificCar {

    public void showHowToBuild() {
        System.out.println("🛠️ Building objects from a blueprint...");

        // 1. Build a Race Car
        CarBlueprint raceCar = new CarBlueprint();
        raceCar.color = "Red";
        raceCar.model = "Ferrari";
        raceCar.speed = 200;

        System.out.println("Constructed Car 1!");
        raceCar.startEngine();
        raceCar.drive();

        System.out.println();

        // 2. Build a Family Van
        CarBlueprint familyVan = new CarBlueprint();
        familyVan.color = "Blue";
        familyVan.model = "Minivan";
        familyVan.speed = 60;

        System.out.println("Constructed Car 2!");
        familyVan.startEngine();
        familyVan.drive();

        System.out.println("\n✨ Both cars were made from the SAME CarBlueprint class!");
    }
}
