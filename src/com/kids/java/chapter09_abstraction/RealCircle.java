package com.kids.java.chapter09_abstraction;

/*
 * ⭕ This is a REAL shape made from the IDEA of a shape!
 */

public class RealCircle extends IdeaShape {

    @Override
    public void draw() {
        System.out.println("⭕ Drawing a perfectly round circle! Weeee!");
    }

    @Override
    public void describe() {
        super.describe(); // Call the parent description
        System.out.println("🔴 Specifically, I am a Circle!");
    }
}
