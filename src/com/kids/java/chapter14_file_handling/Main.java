package com.kids.java.chapter14_file_handling;

/*
 * 🎯 CHAPTER 13 - MAIN CLASS
 * 
 * Let's see how our program saves and remembers things! 💾
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 💾 WELCOME TO CHAPTER 13: FILE HANDLING!   ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        GameSaver saver = new GameSaver();

        // 1. Save a new high score
        System.out.println("--- 1. Saving Progress ---");
        saver.saveScore(500);

        // 2. Load the score back
        System.out.println("\n--- 2. Loading Progress ---");
        saver.loadScore();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ Files help us store information' forever even after the program stops.");
        System.out.println("✅ 'FileWriter' is used to write text INTO a file.");
        System.out.println("✅ 'FileReader' and 'BufferedReader' are used to read text FROM a file.");
        System.out.println("✅ Working with files always requires handling 'IOExceptions' (Input/Output mistakes).");

        System.out.println();
        System.out.println("🏆 YOU ARE A DATA ARCHIVIST! 🏆");
        System.out.println("Next: Choosing from a menu! CHAPTER 14! 🚀");
    }
}
