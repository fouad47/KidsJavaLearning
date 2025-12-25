package com.kids.java.chapter07_inheritance;

/*
 * 🐕 CHAPTER 6: The Child (The Subclass)
 * 
 * We use the word 'extends' to say: 
 * "This class is a CHILD of that class!"
 * 
 * Because Dog extends Animal:
 * 1. A Dog gets 'name', 'eat()', and 'sleep()' for FREE! 🎁
 * 2. A Dog can also have its own special things (like barking).
 */

public class Dog extends Animal {

    public void bark() {
        System.out.println("🐕 Woof! Woof! My name is " + name + "!");
    }

    // We can also change how a parent's action works!
    // This is called 'Overriding'.
    @Override
    public void eat() {
        System.out.println("🦴 " + name + " is crunching on a bone! Crunch crunch!");
    }
}
