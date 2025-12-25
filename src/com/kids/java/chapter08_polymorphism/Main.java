package com.kids.java.chapter08_polymorphism;

/*
 * 🎯 CHAPTER 7 - MAIN CLASS
 * 
 * Let's see how Polymorphism works in action!
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🌈 WELCOME TO CHAPTER 7: POLYMORPHISM!     ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("--- 🧸 Pressing 'Play' on different toys ---");

        // We can treat different toys as just a 'ToyButton'!
        ToyButton toy1 = new MusicToy();
        ToyButton toy2 = new LightToy();

        System.out.println("1. Picking up a toy...");
        toy1.pressPlay(); // Plays Music

        System.out.println("\n2. Picking up another toy...");
        toy2.pressPlay(); // Shines Light

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Polymorphism' means one action can behave in many ways.");
        System.out.println("✅ The same method call (pressPlay) gives different results.");
        System.out.println("✅ This is like having one remote that works for many different toys!");
        System.out.println("✅ It makes our code very flexible and smart!");

        System.out.println();
        System.out.println("🏆 YOU ARE A SHAPE-SHIFTER PROGRAMMER! 🏆");
        System.out.println("You know how to make one action do many cool things!");
        System.out.println("Next: Working with just ideas? CHAPTER 8! 🚀");
    }
}
