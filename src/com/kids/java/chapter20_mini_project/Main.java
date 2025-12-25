package com.kids.java.chapter20_mini_project;

/*
 * 🎯 CHAPTER 19: MINI PROJECT - ROBOT PET GAME
 * 
 * CONGRATULATIONS! 🎓
 * This is the final chapter. We have combined everything:
 * - OOP: Classes, Objects, Inheritance, Polymorphism, Abstraction, Encapsulation
 * - Lists (Collections)
 * - Files (File Handling)
 * - Oopsies (Exception Handling)
 * - Robots checking Robots (Automation)
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🏁 WELCOME TO THE FINAL MINI PROJECT!      ║");
        System.out.println("║        🤖 THE ROBOT PET GAME 🤖            ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // 1. Run Automated Tests first to make sure game is safe!
        GameTest testingRobot = new GameTest();
        testingRobot.runTests();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("🎮 STARTING THE GAME!");
        System.out.println("=".repeat(50));

        GameEngine game = new GameEngine();

        // 2. Add some pets
        game.addPet(new RoboDog("Flash"));
        game.addPet(new RoboCat("Luna"));

        // 3. Play and see Polymorphism in action
        game.playWithAll();

        // 4. Try to feed a pet (Exception Handling)
        try {
            game.feedPet(0); // Feed Flash
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Save the game (File Handling)
        game.saveGame();

        System.out.println("\n🎉 YOU HAVE FINISHED THE JOURNEY! 🎉");
        System.out.println("You started from ZERO and now you are an ADVANCED programmer.");
        System.out.println("You understand Classes, Objects, Logic, and even Automation!");
        System.out.println();
        System.out.println("🌟 Keep coding, keep curious, and change the world! 🚀");
        System.out.println("\n- Your Senior Java Teacher");
    }
}
