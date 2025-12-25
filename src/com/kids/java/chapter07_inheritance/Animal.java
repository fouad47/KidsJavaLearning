package com.kids.java.chapter07_inheritance;

/*
 * 🐾 CHAPTER 6: The Parent (The Base Class)
 * 
 * Inheritance is like a FAMILY TREE! 🌳
 * 
 * If you are a child, you might inherit your eyes from your mom
 * or your smile from your dad.
 * 
 * In Java, a CHILD class can inherit things from a PARENT class.
 * This saves us from writing the same code over and over!
 * 
 * Every Animal breathes and eats. So let's put that in the parent class!
 */

public class Animal {

    public String name;

    public void eat() {
        System.out.println("😋 " + name + " is eating... Yum!");
    }

    public void sleep() {
        System.out.println("😴 " + name + " is sleeping... zzz...");
    }
}
