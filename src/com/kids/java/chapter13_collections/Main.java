package com.kids.java.chapter13_collections;

/*
 * 🎯 CHAPTER 12 - MAIN CLASS
 * 
 * Let's see how our smart organizers work! 📦
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 📦 WELCOME TO CHAPTER 12: COLLECTIONS!     ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        ToyInventory myInventory = new ToyInventory();

        myInventory.playWithArrayList();
        myInventory.playWithHashMap();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Collections' help store and organize lots of items.");
        System.out.println("✅ 'ArrayList' is great for lists where order matters.");
        System.out.println("✅ 'HashMap' is great for looking up things using a name (key).");
        System.out.println("✅ Coding is easier when our things are organized! 🧹");

        System.out.println();
        System.out.println("🏆 YOU ARE AN ORGANIZING EXPERT! 🏆");
        System.out.println("Next: Saving your progress! CHAPTER 13! 🚀");
    }
}
