package com.kids.java.chapter04_user_input;

/*
 * 🎯 CHAPTER 4 - MAIN CLASS
 * 
 * This is where we run our "Talking Computer" program!
 * Run this and look at the 'Console' at the bottom to talk to your computer.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- WELCOME TO CHAPTER 4: USER INPUT ---");

        TalkingComputer myRobot = new TalkingComputer();
        myRobot.startListening();

        System.out.println("----------------------------------------");
    }
}
