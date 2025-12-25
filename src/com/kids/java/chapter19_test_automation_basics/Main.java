package com.kids.java.chapter19_test_automation_basics;

/*
 * 🎯 CHAPTER 18 - MAIN CLASS
 * 
 * Let's see our first Automation Robots in action! 🤖
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ 🤖 WELCOME TO CHAPTER 18: TEST AUTOMATION! ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        WhatIsTesting intro = new WhatIsTesting();
        intro.explainAutomation();

        // 1. Math Automation
        CalculatorAutomationTest mathRobot = new CalculatorAutomationTest();
        mathRobot.runTests();

        // 2. Login Automation
        LoginCheckTest loginRobot = new LoginCheckTest();
        loginRobot.runLoginTests();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Testing' is checking if our code really works.");
        System.out.println("✅ 'Automation' is writing code to test other code.");
        System.out.println("✅ We compare EXPECTED results with ACTUAL results.");
        System.out.println("✅ If they are different, we found a BUG! 🐛");
        System.out.println("✅ Robots make testing fast, easy, and accurate! 🤖");

        System.out.println();
        System.out.println("🏆 YOU ARE AN AUTOMATION HERO! 🏆");
        System.out.println("Next: The Big Challenge! CHAPTER 19! 🚀");
    }
}
