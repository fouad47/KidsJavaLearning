package com.kids.java.chapter09_abstraction;

/*
 * 💭 CHAPTER 8: The Idea (Abstraction)
 * 
 * Abstraction is about working with IDEAS rather than all the details. 🧠
 * 
 * Imagine I say the word "SHAPE". You have an idea of what it is, 
 * but you can't DRAW just a 'shape'. It has to be a circle, a square, 
 * or a triangle to be real.
 * 
 * In Java, we use 'abstract' for things that are IDEAS but not real yet!
 */

public abstract class IdeaShape {

    // We use 'abstract' here too.
    // It means: "All shapes MUST be drawn, but I don't know HOW yet!"
    public abstract void draw();

    // Abstract classes can have real methods too!
    public void describe() {
        System.out.println("✨ I am an idea of a shape. I have many forms!");
    }
}
