package com.kids.java.chapter10_interfaces;

/*
 * 🎮 This class "implements" (follows) the GameRules!
 * 
 * When we use 'implements', Java FORCES us to follow 
 * every single rule in the Rule Book (Interface).
 */

public class MyPlayer implements GameRules {

    private String name;

    public MyPlayer(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("🦘 " + name + " is jumping high over an obstacle!");
    }

    @Override
    public void run() {
        System.out.println("🏃 " + name + " is running fast towards the finish line!");
    }

    @Override
    public void sayPhrase() {
        System.out.println("🗣️ " + name + " says: 'I am the champion!'");
    }
}
