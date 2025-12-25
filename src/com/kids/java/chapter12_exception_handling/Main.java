package com.kids.java.chapter12_exception_handling;

/*
 * 🎯 CHAPTER 11 - MAIN CLASS
 * 
 * Let's see how our program handles mistakes without crashing! 🚀
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🩹 WELCOME TO CHAPTER 11: OOPSIE HANDLING! ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        OopsieHandler handler = new OopsieHandler();

        // 1. Math Oopsie
        System.out.println("--- 1. The Math Test ---");
        handler.tryToDivide(10, 2); // Correct
        handler.tryToDivide(10, 0); // Oopsie!

        // 2. Toy Box Oopsie
        System.out.println("\n--- 2. The Toy Box Search ---");
        String[] myToys = { "Robot", "Doll", "Car" };

        handler.tryToFindToy(myToys, 1); // Correct (Doll)
        handler.tryToFindToy(myToys, 5); // Oopsie! (Doesn't exist)

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Exceptions' are errors or mistakes in our code.");
        System.out.println("✅ 'try' is where we put code that might have an oopsie.");
        System.out.println("✅ 'catch' is where we fix the oopsie politely.");
        System.out.println("✅ 'finally' is code that runs no matter what happens.");
        System.out.println("✅ Handling exceptions keeps our programs running smoothly! 💪");

        System.out.println();
        System.out.println("🏆 YOU ARE A MISTAKE FIXER! 🏆");
        System.out.println("Next: Organizing your things! CHAPTER 12! 🚀");
    }
}
