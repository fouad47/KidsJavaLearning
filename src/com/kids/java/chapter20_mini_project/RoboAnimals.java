package com.kids.java.chapter20_mini_project;

/*
 * 🌟 Level 1: INHERITANCE & POLYMORPHISM
 */

class RoboDog extends RobotPet {
    public RoboDog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("🐕 " + getName() + " says: Woof! Beep! Woof!");
    }
}

class RoboCat extends RobotPet {
    public RoboCat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("🐈 " + getName() + " says: Meow... Buzz... Meow!");
    }
}
