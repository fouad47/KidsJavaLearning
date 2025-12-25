package com.kids.java.chapter05_class_object;

/*
 * 🎯 CHAPTER 4 - MAIN CLASS
 * 
 * Let's see how Blueprints and Objects work together!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🚗 WELCOME TO CHAPTER 4: CLASSES & OBJECTS! ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("--- Understanding the Difference ---");
        System.out.println("Class  = The Instruction Manual (Blueprint) 📑");
        System.out.println("Object = The real LEGO car built from it 🧱");
        System.out.println();

        MySpecificCar factory = new MySpecificCar();
        factory.showHowToBuild();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ A 'Class' is a blueprint or a template.");
        System.out.println("✅ An 'Object' is a real thing built from that blueprint.");
        System.out.println("✅ You can make many unique objects from just one class!");
        System.out.println("✅ Objects have properties (color, model) and actions (drive, stop).");

        System.out.println();
        System.out.println("🏆 YOU ARE AN ARCHITECT! 🏆");
        System.out.println("You now understand the heart of Java: OOP!");
        System.out.println("Next: Let's learn to hide secrets in CHAPTER 5! 🚀");
    }
}
