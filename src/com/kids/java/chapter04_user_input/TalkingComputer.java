package com.kids.java.chapter04_user_input;

import java.util.Scanner;

/*
 * 🎤 CHAPTER 4: Talking to the Computer (User Input)
 * 
 * Imagine if your robot could only talk BUT never listen. That would be a boring robot!
 * In Java, we use something called a 'Scanner' to help the computer listen to what you type.
 * 
 * Think of the Scanner like a "Ear" for the computer.
 */
public class TalkingComputer {

    public void startListening() {
        // 1. We create our "Ear" (Scanner)
        // System.in means it's listening to what you type in the console
        Scanner keyboard = new Scanner(System.in);

        System.out.println("🤖: Hello! I am your Java friend. What is your name?");
        System.out.print("You: ");

        // 2. The computer waits for you to type something and press Enter
        String name = keyboard.nextLine();

        System.out.println("🤖: Wow, " + name + " is a great name! How old are you?");
        System.out.print("You: ");

        // 3. We can also listen for numbers!
        int age = keyboard.nextInt();

        System.out.println("🤖: " + age + " years old? You are becoming a master coder!");

        if (age < 10) {
            System.out.println("🤖: You are very young and smart!");
        } else {
            System.out.println("🤖: You are growing up so fast!");
        }

        // 4. Always remember to "close the ear" when you are done!
        keyboard.close();
    }
}
