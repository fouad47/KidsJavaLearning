package com.kids.java.chapter03_conditions;

/*
 * 💫 CHAPTER 3: Loops (for)
 * 
 * Computers never get tired of repeating things! 🔄
 * 
 * A 'loop' is used when we want to do the same thing many times.
 * 
 * Imagine you want to count 10 stars in the sky. ✨
 * Instead of writing 10 lines of code, we use a loop!
 */

public class CountingStars {

    public void countStars(int numberOfStars) {
        System.out.println("✨ Let's count " + numberOfStars + " stars:");

        /*
         * The 'for' loop has 3 parts:
         * 1. Start: i = 1
         * 2. Stop: i <= numberOfStars
         * 3. Next: i = i + 1 (or i++)
         */
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.println("Star number " + i + " is shining! 🌟");
        }

        System.out.println("Done! The sky looks beautiful! 😍");
    }

    public void jumpingJacks(int count) {
        System.out.println("\n🏃 Let's do " + count + " jumping jacks!");

        int current = 1;
        // This is a 'while' loop. It keeps going WHILE the condition is true!
        while (current <= count) {
            System.out.print(current + "... ");
            current++;
        }

        System.out.println("\nPhew! I'm tired. Great exercise! 💪");
    }
}
