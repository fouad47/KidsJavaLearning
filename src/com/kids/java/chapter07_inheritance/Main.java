package com.kids.java.chapter07_inheritance;

/*
 * 🎯 CHAPTER 6 - MAIN CLASS
 * 
 * Let's see how our code family works!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🐾 WELCOME TO CHAPTER 6: INHERITANCE!      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("--- 🐕 Meet Buddy the Dog ---");
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        // Buddy uses things inherited from Animal!
        myDog.sleep(); // Inherited from Animal

        // Buddy uses his own special Dog things!
        myDog.bark();

        // Buddy uses his SPECIAL version of eating!
        myDog.eat();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Inheritance' lets a class get properties from another class.");
        System.out.println("✅ We use the 'extends' keyword for inheritance.");
        System.out.println("✅ The 'Parent' class has shared things.");
        System.out.println("✅ The 'Child' class adds special things or changes parent things.");
        System.out.println("✅ This makes our code much cleaner and organized!");

        System.out.println();
        System.out.println("🏆 YOU ARE A FAMILY TREE BUILDER! 🏆");
        System.out.println("You know how to share code between parents and children!");
        System.out.println("Next: Same button, different results? CHAPTER 7! 🚀");
    }
}
