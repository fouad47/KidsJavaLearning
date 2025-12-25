package com.kids.java.chapter11_static_final;

/*
 * 🏛️ CHAPTER 10: Shared and Permanent (Static & Final)
 * 
 * STATIC means "SHARED". 🤝
 * Imagine a school. All students go to the SAME school. 
 * Instead of giving every student their own school name, 
 * we make it 'static' so they all share one!
 * 
 * FINAL means "FIXED". 🛑
 * Like a rule that NEVER changes. Once you set a 'final' value, 
 * no one can ever change it!
 */

public class SchoolInfo {

    // STATIC: All students share this one name
    public static String schoolName = "Magic Academy for Kids";

    // NON-STATIC: Every student has their OWN name
    public String studentName;

    public SchoolInfo(String name) {
        this.studentName = name;
    }

    public void introduce() {
        System.out.println("👋 Hi, I'm " + studentName + " and I go to " + schoolName + "!");
    }
}
