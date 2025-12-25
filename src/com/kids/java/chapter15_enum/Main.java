package com.kids.java.chapter15_enum;

/*
 * 🎯 CHAPTER 14 - MAIN CLASS
 * 
 * Let's see how our fixed choices (Menu) work! 📋
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 📋 WELCOME TO CHAPTER 14: ENUMS!           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        GameSettings settings = new GameSettings();

        // 1. Setting the level to EASY
        System.out.println("--- 1. Picking Easy mode ---");
        settings.setLevel(GameLevel.EASY);
        settings.showLevelInfo();

        // 2. Setting the level to HARD
        System.out.println("\n--- 2. Feeling brave? ---");
        settings.setLevel(GameLevel.HARD);
        settings.showLevelInfo();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Enums' are used for a fixed list of choices.");
        System.out.println("✅ They prevent mistakes because you can only pick what's on the list.");
        System.out.println("✅ We often use 'switch' statements to handle different enum choices.");
        System.out.println("✅ Enums make our code very easy to read, like a real menu! 🧾");

        System.out.println();
        System.out.println("🏆 YOU ARE A MENU MASTER! 🏆");
        System.out.println("Next: Creating magic containers! CHAPTER 15! 🚀");
    }
}
