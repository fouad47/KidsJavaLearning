package com.kids.java.chapter03_conditions;

/*
 * 🎯 CHAPTER 3 - MAIN CLASS
 * 
 * Let's see how our computer makes decisions and repeats tasks!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ 🚦 WELCOME TO CHAPTER 3: PATHS AND LOOPS!  ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println();

        // 1. Decisions (if / else)
        System.out.println("--- 1. Testing our Decisions (If/Else) ---");
        GameLives game = new GameLives();

        game.checkGameOver(3);
        game.checkGameOver(0);
        System.out.println();

        game.checkEnergyLevel(90);
        game.checkEnergyLevel(40);
        game.checkEnergyLevel(10);

        System.out.println();

        // 2. Loops (for / while)
        System.out.println("--- 2. Testing our Loops (Counting) ---");
        CountingStars counter = new CountingStars();

        counter.countStars(5);
        counter.jumpingJacks(10);

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'if' and 'else' help the computer make choices.");
        System.out.println("✅ 'for' loops help us repeat something a certain number of times.");
        System.out.println("✅ 'while' loops keep going until a condition changes.");
        System.out.println("✅ Decision making and repeating are the core of all programs!");

        System.out.println();
        System.out.println("🏆 FANTASTIC! 🏆");
        System.out.println("You now know how to control the flow of your program!");
        System.out.println("Next, we enter the world of objects: CHAPTER 4! 🚀");
    }
}
