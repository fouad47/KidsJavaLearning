package com.kids.java.chapter01_basics;

/*
 * 🎯 CHAPTER 1 - MAIN CLASS
 * 
 * This is where our program starts!
 * 
 * Every Java program needs a "main" method.
 * Think of it as the START button for your program! ▶️
 * 
 * When you run this file, the computer will start reading
 * from the "main" method and do everything inside it!
 */

public class Main {

    // This is the MAIN method - the starting point of our program!
    // Don't worry about understanding all the words yet.
    // Just know that "main" means "start here!"

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║  🎮 WELCOME TO CHAPTER 1: PROGRAMMING BASICS! ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();

        // Let's learn what programming is!
        WhatIsProgramming lesson = new WhatIsProgramming();
        lesson.explainProgramming();
        lesson.showHowItWorks();
        lesson.whyProgramming();

        // Now let's meet our robot friend!
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Now, let's meet your first robot! 🤖");
        System.out.println("=".repeat(50));

        RobotSaysHello robot = new RobotSaysHello();
        robot.introduce();
        robot.sayHello();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ What programming is");
        System.out.println("✅ How programs work");
        System.out.println("✅ Your first Java program!");
        System.out.println("✅ The 'main' method (where programs start)");
        System.out.println();

        robot.sayGoodbye();

        System.out.println();
        System.out.println("🏆 CONGRATULATIONS! 🏆");
        System.out.println("You just ran your first Java program!");
        System.out.println("Ready for Chapter 2? Let's learn about Variables! 🚀");
    }
}
