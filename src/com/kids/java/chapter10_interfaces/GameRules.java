package com.kids.java.chapter10_interfaces;

/*
 * 📜 CHAPTER 9: The Rule Book (Interfaces)
 * 
 * An 'Interface' is like a RULE BOOK or a CONTRACT. 📑
 * 
 * Imagine you are making a video game. Every player MUST be
 * able to Jump and Run. But how they jump might be different.
 * 
 * An interface doesn't DO anything itself. It only says:
 * "If you want to be a Player, you MUST follow these rules!"
 */

public interface GameRules {

    // In an interface, we just list the rules.
    // We don't write the code inside (no curly braces {} here!)
    void jump();

    void run();

    void sayPhrase();
}
