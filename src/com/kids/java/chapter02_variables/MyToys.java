package com.kids.java.chapter02_variables;

/*
 * 🧸 CHAPTER 2: Strings
 * 
 * We learned how to store numbers. But what about words? 📝
 * 
 * For words and sentences, we use a 'String'.
 * Imagine it as a STRING of letters tied together! 🧵
 */

public class MyToys {

    // 'String' is for text
    // We always put String text inside "Double Quotes"!
    public String favoriteToy = "Teddy Bear";
    public String robotName = "Flash";

    public void showMyToys() {
        System.out.println("🧸 My favorite toy is a " + favoriteToy + ".");
        System.out.println("🤖 My robot's name is " + robotName + ".");
    }

    public void renameRobot(String newName) {
        System.out.println("📝 Changing robot name from " + robotName + " to " + newName + "...");
        robotName = newName; // We put a new name in the box!
    }

    public void describeToyBox() {
        // We can combine strings using the '+' sign!
        String message = "My toy box has a " + favoriteToy + " and a robot named " + robotName + "!";
        System.out.println(message);
    }
}
