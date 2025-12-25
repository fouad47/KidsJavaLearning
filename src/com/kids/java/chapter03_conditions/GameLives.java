package com.kids.java.chapter03_conditions;

/*
 * 🚦 CHAPTER 3: Decisions (if / else)
 * 
 * Computers can make decisions! 🤖
 * 
 * We use 'if' to tell the computer:
 * "IF something is true, do THIS. Otherwise (ELSE), do THAT."
 * 
 * Just like when your mom says:
 * "IF you finish your homework, you can play games. ELSE, you must study!"
 */

public class GameLives {

    public void checkGameOver(int lives) {
        System.out.println("🧐 Checking lives: " + lives);

        if (lives > 0) {
            // This happens if lives are more than 0
            System.out.println("💪 Keep going! You still have lives left.");
        } else {
            // This happens if lives are 0 or less
            System.out.println("👻 GAME OVER! Better luck next time.");
        }
    }

    public void checkEnergyLevel(int energy) {
        System.out.println("🔋 Energy Level: " + energy + "%");

        if (energy > 80) {
            System.out.println("🚀 You are SUPER FAST!");
        } else if (energy > 50) {
            System.out.println("🏃 You are running at a good speed.");
        } else if (energy > 20) {
            System.out.println("Walking... getting tired...");
        } else {
            System.out.println("😴 You need to rest! No energy left.");
        }
    }
}
