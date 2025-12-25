package com.kids.java.chapter20_mini_project;

/*
 * 🌟 Level 1: CORE OOP
 * 
 * Our abstract base class for any Robot Pet.
 */

public abstract class RobotPet {
    private String name;
    private int energy = 100;

    public RobotPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0)
            this.energy = 0;
        else if (energy > 100)
            this.energy = 100;
        else
            this.energy = energy;
    }

    // Abstract method: Every pet makes a different sound!
    public abstract void makeSound();

    public void sleep() {
        System.out.println("😴 " + name + " is recharging... Battery at 100%!");
        setEnergy(100);
    }
}
