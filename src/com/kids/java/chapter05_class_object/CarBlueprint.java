package com.kids.java.chapter06_encapsulation;

/*
 * 🚗 CHAPTER 4: The Blueprint (The Class)
 * 
 * Imagine you want to build a LEGO car. 🧱
 * Before you start building, you have a set of INSTRUCTIONS.
 * 
 * In Java, the 'Class' is the set of instructions (a Blueprint).
 * It tells the computer what a "Car" should look like and what it can do.
 * 
 * But the blueprint itself IS NOT a car. You can't drive a drawing! 🚙
 */

public class CarBlueprint {

    // Properties (What the car HAS)
    public String color;
    public String model;
    public int speed;

    // Actions (What the car CAN DO)
    public void startEngine() {
        System.out.println("🦁 VROOM! The " + color + " " + model + "'s engine is roaring!");
    }

    public void drive() {
        System.out.println("🛣️ The car is driving at " + speed + " mph.");
    }

    public void stop() {
        System.out.println("🛑 Squeak! The car has stopped.");
    }
}
