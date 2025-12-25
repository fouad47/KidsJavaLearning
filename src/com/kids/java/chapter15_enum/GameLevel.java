package com.kids.java.chapter15_enum;

/*
 * 📋 CHAPTER 14: Fixed Choices (Enums)
 * 
 * Sometimes we have a limited list of choices that will NEVER change.
 * Like the days of the week, or colors of a traffic light. 🚥
 * 
 * In Java, we call these 'Enums' (short for Enumeration).
 * It's like a MENU where you can only pick from the options listed!
 */

public enum GameLevel {

    // Here are our fixed choices!
    EASY,
    MEDIUM,
    HARD,
    EXPERT
}

class GameSettings {

    private GameLevel currentLevel;

    public void setLevel(GameLevel level) {
        this.currentLevel = level;
        System.out.println("🕹️ Game level is now set to: " + level);
    }

    public void showLevelInfo() {
        switch (currentLevel) {
            case EASY:
                System.out.println("👶 Easy Mode: You get extra lives and more time!");
                break;
            case MEDIUM:
                System.out.println("🏃 Medium Mode: A fun challenge for everyone!");
                break;
            case HARD:
                System.out.println("🔥 Hard Mode: Watch out! Enemies are faster!");
                break;
            case EXPERT:
                System.out.println("🧠 Expert Mode: Only for the best of the best!");
                break;
        }
    }
}
