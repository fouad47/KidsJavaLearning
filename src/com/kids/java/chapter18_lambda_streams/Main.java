package com.kids.java.chapter18_lambda_streams;

/*
 * 🎯 CHAPTER 17 - MAIN CLASS
 * 
 * Let's see some smart code in action! ⚡
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║ ⚡ WELCOME TO CHAPTER 17: LAMBDAS & STREAMS! ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        SmartScoreFilter filter = new SmartScoreFilter();
        filter.processScores();

        System.out.println();
        System.out.println("🎓 WHAT YOU LEARNED:");
        System.out.println("✅ 'Lambdas' are short ways to write logic using -> symbol.");
        System.out.println("✅ 'Streams' let us work with lists of items very easily.");
        System.out.println("✅ '.filter()' picks only the items we want.");
        System.out.println("✅ '.map()' changes every item in the list.");
        System.out.println("✅ Modern Java is fast, smart, and FUN! ⚡");

        System.out.println();
        System.out.println("🏆 YOU ARE A SMART CODER! 🏆");
        System.out.println("Next: Robots checking your work! CHAPTER 18! 🚀");
    }
}
