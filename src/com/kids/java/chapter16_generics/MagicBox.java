package com.kids.java.chapter16_generics;

/*
 * 🪄 CHAPTER 15: The Magic Box (Generics)
 * 
 * Imagine you have a box that can only hold a TEDDY BEAR. 🧸
 * If you want to hold a ROBOT, you need a different box. 🤖
 * 
 * That's kind of boring! Wouldn't it be cool if you had a 
 * MAGIC BOX that could hold ANY one type of toy you chose?
 * 
 * In Java, we call this 'Generics'. We use the symbol <T> 
 * to mean "Any Type of toy I want!"
 */

public class MagicBox<T> {

    // T is a placeholder for whatever type we want!
    private T item;

    public void put(T newItem) {
        this.item = newItem;
        System.out.println("🪄 Poof! I put something in the magic box!");
    }

    public T get() {
        return item;
    }

    public void showItemInfo() {
        if (item != null) {
            System.out.println("👀 Inside the box, I found: " + item.toString());
        } else {
            System.out.println("🏜️ The box is empty!");
        }
    }
}
