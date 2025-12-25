package com.kids.java.chapter17_multithreading;

/*
 * 🏃 This represents the player moving in our game.
 * It will run as its own thread!
 */

public class PlayerMovement extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🏃 [Player Thread] Player is running towards the goal... (Step: " + i + ")");
            try {
                Thread.sleep(800); // Players move a bit faster than the music beats!
            } catch (InterruptedException e) {
                System.out.println("The player tripped!");
            }
        }
        System.out.println("🏃 [Player Thread] Player reached the goal! 🏁");
    }
}
