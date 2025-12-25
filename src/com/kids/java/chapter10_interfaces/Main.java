package com.kids.java.chapter10_interfaces;

/*
 * 🎯 CHAPTER 9 - MAIN CLASS
 * 
 * Let's see how our Rule Book keeps everyone in line!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 📜 WELCOME TO CHAPTER 9: INTERFACES!       ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("--- Following the Game Rule Book ---");

        // We can treat our player as a set of rules!
        GameRules mario = new MyPlayer("Super Mario");

        mario.run();
        mario.jump();
        mario.sayPhrase();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Interfaces' are 100% rule books.");
        System.out.println("✅ They tell you WHAT a class must do, but not HOW to do it.");
        System.out.println("✅ We use 'implements' to follow the rules of an interface.");
        System.out.println("✅ This helps different programmers work together by agreeing on rules first!");

        System.out.println();
        System.out.println("🏆 YOU ARE A RULES MASTER! 🏆");
        System.out.println("You have completed LEVEL 2: Core OOP Concepts!");
        System.out.println("Next: Advanced Java tricks start with CHAPTER 10! 🚀");
    }
}
