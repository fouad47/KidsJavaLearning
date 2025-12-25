package com.kids.java.chapter02_variables;

/*
 * 🎯 CHAPTER 2 - MAIN CLASS
 * 
 * Let's play with our Magic Boxes (Variables)!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ 📦 WELCOME TO CHAPTER 2: MAGIC BOXES!      ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("1. Let's see our Game Score (Numbers and Booleans):");
        GameScore game = new GameScore();
        game.showStatus();

        game.addPoints(50);
        game.addPoints(100);
        game.loseLife();
        game.showStatus();

        System.out.println();
        System.out.println("2. Let's look at our Toy Names (Strings):");
        MyToys toys = new MyToys();
        toys.showMyToys();
        toys.renameRobot("Zippy");
        toys.describeToyBox();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ Variables are like boxes that store things.");
        System.out.println("✅ 'int' stores whole numbers.");
        System.out.println("✅ 'boolean' stores true or false.");
        System.out.println("✅ 'String' stores words or sentences.");
        System.out.println("✅ We can change the values inside our magic boxes!");

        System.out.println();
        System.out.println("🏆 GREAT JOB! 🏆");
        System.out.println("You have mastered the Magic Boxes of Java!");
        System.out.println("Ready for Chapter 3? Let's learn about Paths and Loops! 🚀");
    }
}
