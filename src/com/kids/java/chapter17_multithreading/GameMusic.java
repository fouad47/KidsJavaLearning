package com.kids.java.chapter17_multithreading;

/*
 * 🎵 CHAPTER 16: Multi-tasking (Multithreading)
 * 
 * Have you ever rubbed your belly and patted your head at the same time? 🤸
 * It's hard! But computers are GREAT at it.
 * 
 * In Java, we call one task a 'THREAD'. 
 * Multithreading means running many threads at the same time.
 * 
 * In a game, we want the MUSIC to play while our PLAYER is moving.
 */

public class GameMusic extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🎵 [Music Thread] Playing happy background music... (Beats: " + i + ")");
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Noooo! The music was interrupted!");
            }
        }
        System.out.println("🎵 [Music Thread] Song finished!");
    }
}
