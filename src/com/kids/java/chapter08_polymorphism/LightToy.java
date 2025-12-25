package com.kids.java.chapter08_polymorphism;

/*
 * 💡 LightToy is a child of ToyButton.
 */

public class LightToy extends ToyButton {

    @Override
    public void pressPlay() {
        System.out.println("💡 Light Toy: Shining bright colors! Red... Blue... Green! ✨");
    }
}
