package com.kids.java.chapter20_mini_project;

import java.util.ArrayList;
import java.io.*;

/*
 * 🌟 Level 2: COLLECTIONS & FILE HANDLING & EXCEPTIONS
 */

public class GameEngine {
    private ArrayList<RobotPet> myPets = new ArrayList<>();

    public void addPet(RobotPet pet) {
        myPets.add(pet);
        System.out.println("✅ " + pet.getName() + " was added to your pet collection!");
    }

    public void playWithAll() {
        System.out.println("\n🎉 Starting Playtime!");
        for (RobotPet pet : myPets) {
            pet.makeSound();
            pet.setEnergy(pet.getEnergy() - 20);
            System.out.println("⚡ " + pet.getName() + " energy level: " + pet.getEnergy() + "%");
        }
    }

    public void saveGame() {
        try (FileWriter writer = new FileWriter("game_save.txt")) {
            for (RobotPet pet : myPets) {
                writer.write(pet.getName() + "," + pet.getEnergy() + "\n");
            }
            System.out.println("\n💾 Game saved successfully!");
        } catch (IOException e) {
            System.out.println("🛑 Save Error: " + e.getMessage());
        }
    }

    public void feedPet(int index) throws Exception {
        if (index < 0 || index >= myPets.size()) {
            throw new Exception("Pet index " + index + " not found!");
        }
        RobotPet pet = myPets.get(index);
        System.out.println("🍎 Feeding " + pet.getName() + "...");
        pet.setEnergy(pet.getEnergy() + 20);
    }
}
