package com.kids.java.chapter09_abstraction;

/*
 * 🎯 CHAPTER 8 - MAIN CLASS
 * 
 * Let's see how Ideas (Abstract) and Reality (Concrete) work!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 💭 WELCOME TO CHAPTER 8: ABSTRACTION!      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // This is IMPORTANT: You CANNOT do this:
        // IdeaShape myIdea = new IdeaShape(); // Computer says NO! ❌
        // Because "IdeaShape" is just an idea, not a real thing you can build!

        System.out.println("--- Making an Idea REAL ---");

        IdeaShape myCircle = new RealCircle();
        myCircle.describe();
        myCircle.draw();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Abstraction' means hiding the mess and showing only the important ideas.");
        System.out.println("✅ 'abstract' classes are IDEAS. You cannot make objects from them directly.");
        System.out.println("✅ 'abstract' methods are chores that children MUST complete.");
        System.out.println("✅ This helps us plan our programs before we worry about the tiny details!");

        System.out.println();
        System.out.println("🏆 YOU ARE A MASTER PLANNER! 🏆");
        System.out.println("You know how to use the power of ideas!");
        System.out.println("Next: Creating a Rule Book? CHAPTER 9! 🚀");
    }
}
