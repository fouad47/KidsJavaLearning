package com.kids.java.chapter19_test_automation_basics;

/*
 * 🔑 Let's test a simple Login logic!
 */

public class LoginCheckTest {

    public void testLogin(String username, String password) {
        System.out.println("\n--- 🔑 Testing Login for user: " + username + " ---");

        // Real logic usually comes from a database, but we use an IF statement for now!
        boolean loginWorks = username.equals("Admin") && password.equals("MagicCode123");

        // Let's check the result
        if (loginWorks) {
            System.out.println("✅ LOGIN PASS: Access Granted! Welcome, " + username + "!");
        } else {
            System.out.println("❌ LOGIN FAIL: Invalid username or password! Access Denied! 🛑");
        }
    }

    public void runLoginTests() {
        // Correct Login
        testLogin("Admin", "MagicCode123");

        // Wrong Username
        testLogin("HackerPlayer", "MagicCode123");

        // Wrong Password
        testLogin("Admin", "WrongPassword");
    }
}
