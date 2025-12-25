package com.kids.java.chapter16_generics;

/*
 * 🎯 CHAPTER 15 - MAIN CLASS
 * 
 * Let's see some Magic Box transformations! 🪄
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🪄 WELCOME TO CHAPTER 15: GENERICS!        ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // 1. A Magic Box for Strings (Words)
        System.out.println("--- 1. Making a Word Box ---");
        MagicBox<String> wordBox = new MagicBox<>();
        wordBox.put("Abacadabra!");
        wordBox.showItemInfo();

        // 2. A Magic Box for Integers (Numbers)
        System.out.println("\n--- 2. Making a Number Box ---");
        MagicBox<Integer> numberBox = new MagicBox<>();
        numberBox.put(42);
        numberBox.showItemInfo();

        // 3. A Magic Box for Booleans (True/False)
        System.out.println("\n--- 3. Making a Secret Box ---");
        MagicBox<Boolean> secretBox = new MagicBox<>();
        secretBox.put(true);
        secretBox.showItemInfo();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Generics' help us create one class that works for many types.");
        System.out.println("✅ We use the <T> symbol as a placeholder for a type.");
        System.out.println("✅ It makes our box flexible because it can hold whatever we want!");
        System.out.println("✅ This helps us write less code but do more things! 🪄");

        System.out.println();
        System.out.println("🏆 YOU ARE A MAGIC CODER! 🏆");
        System.out.println("Next: Doing two things at once! CHAPTER 16! 🚀");
    }
}
