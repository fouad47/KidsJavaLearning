package com.kids.java.chapter17_multithreading;

/*
 * 🎯 CHAPTER 16 - MAIN CLASS
 * 
 * Let's start both tasks and see them run together! 🚀
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🧵 WELCOME TO CHAPTER 16: MULTITHREADING!  ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("--- 🎮 Starting the Game Engine ---");

        // Creating our two threads
        GameMusic musicTask = new GameMusic();
        PlayerMovement movementTask = new PlayerMovement();

        // 🚨 IMPORTANT: Use .start() to begin the task!
        // If you use .run(), it won't be multi-tasking!
        musicTask.start();
        movementTask.start();

        // This is the Main thread talking
        System.out.println("💡 [Main Engine] Both threads are running! The computer is multi-tasking!");

        // Wait for them to finish before continuing
        try {
            musicTask.join();
            movementTask.join();
        } catch (InterruptedException e) {
            System.out.println("Main engine was interrupted.");
        }

        System.out.println("\n🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Multithreading' means doing many things at once.");
        System.out.println("✅ A 'Thread' is a single task or path of code.");
        System.out.println("✅ We use .start() to make a thread take its own path.");
        System.out.println("✅ This makes games and apps feel smooth and alive! 🎮");

        System.out.println();
        System.out.println("🏆 YOU ARE A MULTI-TASKING PRO! 🏆");
        System.out.println("Next: Smart and short code! CHAPTER 17! 🚀");
    }
}
