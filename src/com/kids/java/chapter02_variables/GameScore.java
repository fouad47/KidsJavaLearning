package com.kids.java.chapter02_variables;

/*
 * 🎮 CHAPTER 2: Variables & Data Types
 * 
 * Think of a "Variable" as a MAGIC BOX! 📦
 * 
 * Each box has a NAME (so you know what's inside)
 * and a TYPE (so you know what fits inside).
 * 
 * In this example, we'll use variables to keep track of a game!
 */

public class GameScore {

    // 1. 'int' is for numbers (like 1, 10, or 1000)
    // We use it for the score!
    public int score = 0;

    // 2. We can also use 'int' for the number of lives
    public int lives = 3;

    // 3. 'boolean' is for things that are either TRUE or FALSE
    // Is the game over? Yes or No?
    public boolean isGameOver = false;

    // We can change the numbers in our boxes!
    public void addPoints(int points) {
        score = score + points; // We add points to the current score
        System.out.println("✨ Yay! You got " + points + " points. Total Score: " + score);
    }

    public void loseLife() {
        lives = lives - 1; // We take away one life
        System.out.println("💔 Oh no! You lost a life. Lives left: " + lives);

        // If lives reach 0, the game is over!
        if (lives <= 0) {
            isGameOver = true;
        }
    }

    public void showStatus() {
        System.out.println("-------------------------");
        System.out.println("SCORE: " + score);
        System.out.println("LIVES: " + lives);
        System.out.println("GAME OVER? " + isGameOver);
        System.out.println("-------------------------");
    }
}
