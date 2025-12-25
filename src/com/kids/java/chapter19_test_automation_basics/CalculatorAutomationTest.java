package com.kids.java.chapter19_test_automation_basics;

/*
 * 🤖 This is our FIRST AUTOMATED TEST!
 * 
 * A 'Test Case' has 3 parts:
 * 1. Test Data (The numbers we use)
 * 2. Expected Result (What SHOULD happen)
 * 3. Actual Result (What REALLY happens)
 */

public class CalculatorAutomationTest {

    private Calculator calc = new Calculator();

    // This is our 'Assertion' method.
    // An assertion is just a check to see if we reached the goal!
    private void check(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println("✅ PASS: [" + testName + "] - expected " + expected + " and got " + actual + "!");
        } else {
            System.out.println(
                    "❌ FAIL: [" + testName + "] - expected " + expected + " but got " + actual + "! OH NO, A BUG!");
        }
    }

    public void runTests() {
        System.out.println("\n--- 🧮 Running Calculator Automated Tests ---");

        // Test Case 1: Simple Addition
        check("Test Adding 5+5", 10, calc.sum(5, 5));

        // Test Case 2: Simple Subtraction
        check("Test Subtracting 10-4", 6, calc.subtract(10, 4));

        // Test Case 3: A test that might FAIL (oopsie!)
        // Let's pretend we expected 5+5 to be 11
        check("Test with intentional Fail", 11, calc.sum(5, 5));
    }
}
