package com.kids.java.chapter13_collections;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 📦 CHAPTER 12: Organizing Items (Collections)
 * 
 * A 'Collection' is like a SMART TOY BOX! 🧸
 * 
 * We have two main types we'll learn:
 * 
 * 1. ArrayList: Like a bucket of toys where order matters.
 *    You can add, remove, and count them!
 * 
 * 2. HashMap: Like a phone book or a secret code book.
 *    You give it a KEY (a name) and it gives you a VALUE (the item).
 */

public class ToyInventory {

    // 1. ArrayList of Strings (A list of toy names)
    private ArrayList<String> toyList = new ArrayList<>();

    // 2. HashMap of Strings and Integers (Friend name and their favorite number)
    private HashMap<String, Integer> friendNumbers = new HashMap<>();

    public void playWithArrayList() {
        System.out.println("--- 🧸 1. The Dynamic Toy List (ArrayList) ---");

        // Adding items
        toyList.add("Teddy Bear");
        toyList.add("Race Car");
        toyList.add("Lego Set");

        System.out.println("📦 I added 3 toys. Total toys: " + toyList.size());
        System.out.println("👀 The second toy is: " + toyList.get(1));

        // Removing an item
        toyList.remove("Race Car");
        System.out.println("🗑️ Removed the car. Now I have: " + toyList);
    }

    public void playWithHashMap() {
        System.out.println("\n--- 📖 2. The Friend Phone Book (HashMap) ---");

        // Putting items in the map (Key, Value)
        friendNumbers.put("Alice", 7);
        friendNumbers.put("Bob", 12);
        friendNumbers.put("Charlie", 42);

        System.out.println("☎️ Added 3 friends to my book.");

        // Getting an item by its key
        String searchName = "Bob";
        System.out.println("❓ What is " + searchName + "'s favorite number? It is: " + friendNumbers.get(searchName));

        // Checking if someone is there
        if (friendNumbers.containsKey("Alice")) {
            System.out.println("✅ Alice is in my book!");
        }
    }
}
