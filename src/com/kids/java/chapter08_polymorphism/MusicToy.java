package com.kids.java.chapter08_polymorphism;

/*
 * 🎵 MusicToy is a child of ToyButton.
 */

public class MusicToy extends ToyButton {

    @Override
    public void pressPlay() {
        System.out.println("🎵 Music Toy: Playing a happy song... Tra-la-la! 🎶");
    }
}
