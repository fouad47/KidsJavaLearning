package com.kids.java.chapter06_encapsulation;

/*
 * 🎯 CHAPTER 5 - MAIN CLASS
 * 
 * Let's see how we can protect our secrets!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🔒 WELCOME TO CHAPTER 5: ENCAPSULATION!    ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        SecretBox myBox = new SecretBox();

        // 1. Trying to look at the treasure
        System.out.println("👀 What is in the box? " + myBox.getTreasure());

        // 2. Trying to change the treasure with the WRONG password
        System.out.println("\n🚫 Someone tries to change it to 'Rocks' with wrong password...");
        myBox.setTreasure("Rocks", "WrongPass");

        // 3. Changing the treasure with the RIGHT password
        System.out.println("\n🔑 Changing it to 'Rubies' with correct password...");
        myBox.setTreasure("Sparkly Rubies", "Magic123");
        System.out.println("👀 What is in the box now? " + myBox.getTreasure());

        // 4. Using the coins safely
        System.out.println("\n💳 Let's go shopping!");
        myBox.spendCoins(30);
        myBox.spendCoins(80); // This should fail!

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'private' hides data from the outside world.");
        System.out.println("✅ 'Getters' let others see the data safely.");
        System.out.println("✅ 'Setters' let others change the data safely (with rules!).");
        System.out.println("✅ This keeps our code safe and prevents mistakes!");

        System.out.println();
        System.out.println("🏆 YOU ARE A SECURITY EXPERT! 🏆");
        System.out.println("You know how to keep your code secrets safe!");
        System.out.println("Next: Let's see how code families work in CHAPTER 6! 🚀");
    }
}
