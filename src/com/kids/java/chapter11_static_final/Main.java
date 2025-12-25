package com.kids.java.chapter11_static_final;

/*
 * 🎯 CHAPTER 10 - MAIN CLASS
 * 
 * Let's see how Shared and Permanent things work!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🤝 WELCOME TO CHAPTER 10: STATIC & FINAL!  ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // 1. Static (Shared) example
        System.out.println("--- 1. Shared School Name (Static) ---");
        SchoolInfo student1 = new SchoolInfo("Alice");
        SchoolInfo student2 = new SchoolInfo("Bob");

        student1.introduce();
        student2.introduce();

        System.out.println("\n📣 Breaking News! The school changed its name!");
        // Changing it ONCE changes it for EVERYONE!
        SchoolInfo.schoolName = "Super Programmer Academy";

        student1.introduce();
        student2.introduce();

        System.out.println();

        // 2. Final (Fixed) example
        System.out.println("--- 2. Fixed Game Rules (Final) ---");
        GameConstantRules rules = new GameConstantRules();
        rules.tryToChangeRules();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'static' means something is shared by ALL objects of that class.");
        System.out.println("✅ 'final' means something is permanent and cannot be changed.");
        System.out.println("✅ Static is great for shared info like a team name or school name.");
        System.out.println("✅ Final is great for rules or math numbers that never change.");

        System.out.println();
        System.out.println("🏆 YOU ARE A RULES MASTER! 🏆");
        System.out.println("Next: Handling Oopsies! CHAPTER 11! 🚀");
    }
}
