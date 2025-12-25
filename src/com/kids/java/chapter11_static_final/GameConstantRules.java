package com.kids.java.chapter11_static_final;

/*
 * 🏆 This class shows how to use 'final' for rules that never change.
 */

public class GameConstantRules {

    // FINAL: This value is set in stone! 🪨
    // We often use UPPERCASE for final variables.
    public final int MAX_LIVES = 3;

    public void tryToChangeRules() {
        System.out.println("📜 The rule is: You can have at most " + MAX_LIVES + " lives.");

        // Uncommenting the line below would cause an ERROR!
        // MAX_LIVES = 10; // ❌ NOPE! Computer says: "Final means Final!"

        System.out.println("🛑 Remember: Final things can NEVER be changed.");
    }
}
