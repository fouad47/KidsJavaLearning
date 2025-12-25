package com.kids.java.chapter06_encapsulation;

/*
 * 🔒 CHAPTER 5: The Secret Box (Encapsulation)
 * 
 * Encapsulation is a big word that means "HIDING SECRETS". 🤫
 * 
 * Imagine you have a treasure box. You don't want everyone 
 * to touch your treasure directly, right? 
 * 
 * So, you LOCK it and give people a KEY (methods) to interact with it.
 * This way, you can make sure only the "right" things happen!
 */

public class SecretBox {

    // We use 'private' to hide our secret!
    // No one can see 'treasure' from outside this class.
    private String treasure = "Shiny Gold Coins";
    private int numberOfCoins = 100;

    // GETTER: This is like a peephole to LOOK at the secret.
    public String getTreasure() {
        return treasure;
    }

    // SETTER: This is like a small slot to CHANGE the secret,
    // but only if you follow the rules!
    public void setTreasure(String newTreasure, String password) {
        if (password.equals("Magic123")) {
            System.out.println("🤫 Password correct! Changing treasure to: " + newTreasure);
            this.treasure = newTreasure;
        } else {
            System.out.println("🛑 WRONG PASSWORD! You can't touch my treasure!");
        }
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    // A method to safely use our data
    public void spendCoins(int amount) {
        if (amount <= numberOfCoins) {
            numberOfCoins = numberOfCoins - amount;
            System.out.println("💰 Spent " + amount + " coins. Remaining: " + numberOfCoins);
        } else {
            System.out.println("❌ Not enough coins! You only have " + numberOfCoins);
        }
    }
}
