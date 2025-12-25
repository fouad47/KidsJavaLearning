package com.kids.java.chapter20_mini_project;

/*
 * 🌟 Level 3: TEST AUTOMATION
 */

public class GameTest {

    public void runTests() {
        System.out.println("\n--- 🤖 Running Game Automated Tests ---");
        GameEngine engine = new GameEngine();
        RoboDog dog = new RoboDog("Rex");

        // Test 1: Check Energy logic
        int initialEnergy = dog.getEnergy();
        dog.setEnergy(150); // Should cap at 100

        if (dog.getEnergy() == 100) {
            System.out.println("✅ TEST PASS: Energy cap logic works!");
        } else {
            System.out.println("❌ TEST FAIL: Energy went above 100!");
        }

        // Test 2: Check feeding exception
        try {
            engine.feedPet(99); // Invalid index
            System.out.println("❌ TEST FAIL: Exception should have been thrown for invalid index!");
        } catch (Exception e) {
            System.out.println("✅ TEST PASS: Correctly handled missing pet error!");
        }
    }
}
