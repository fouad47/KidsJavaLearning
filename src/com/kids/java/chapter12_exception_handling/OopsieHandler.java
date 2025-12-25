package com.kids.java.chapter12_exception_handling;

/*
 * 🩹 CHAPTER 11: Handling Oopsies (Exceptions)
 * 
 * Sometimes things go WRONG in a program! 😱
 * Maybe a user types a word instead of a number, or tries
 * to divide by zero.
 * 
 * In Java, we call these mistakes "EXCEPTIONS".
 * Instead of letting the program CRASH (stop working),
 * we catch the mistake and handle it politely!
 * 
 * We use 'try' and 'catch':
 * - TRY: "Let's TRY to do this..."
 * - CATCH: "If an oopsie happens, CATCH it here and fix it!"
 */

public class OopsieHandler {

    public void tryToDivide(int number, int divisor) {
        System.out.println("🧮 Let's try to divide " + number + " by " + divisor + "...");

        try {
            // TRY this code
            int result = number / divisor;
            System.out.println("✅ Success! The answer is: " + result);

        } catch (ArithmeticException e) {
            // CATCH the "Divide by zero" oopsie
            System.out.println("🛑 OOPSIE! You can't divide by zero! That's a math rule! 🚫");
        }
    }

    public void tryToFindToy(String[] toyBox, int index) {
        System.out.println("\n🧸 Looking for toy at box number " + index + "...");

        try {
            String toy = toyBox[index];
            System.out.println("🎉 Found it! It's a " + toy + "!");

        } catch (ArrayIndexOutOfBoundsException e) {
            // CATCH the "Looking where nothing exists" oopsie
            System.out.println("🛑 OOPSIE! That toy box doesn't exist! You looked too far! 📦");
        } finally {
            // FINALLY always runs!
            System.out.println("✨ We finished checking the box.");
        }
    }
}
