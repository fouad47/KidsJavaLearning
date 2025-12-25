package com.kids.java.chapter14_file_handling;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * 💾 CHAPTER 13: Saving & Reading (File Handling)
 * 
 * Have you ever played a game and wanted to SAVE your score? 🎮
 * 
 * Normally, when you turn off a computer, all the variables
 * (Magic Boxes) disappear! 😱
 * 
 * To keep information forever, we need to WRITE it into a FILE 
 * on the computer's hard drive.
 */

public class GameSaver {

    private String fileName = "high_score.txt";

    public void saveScore(int score) {
        System.out.println("💾 Writing score " + score + " to " + fileName + "...");

        // We use FileWriter to write text to a file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Your High Score is: " + score);
            System.out.println("✅ Score saved successfully!");
        } catch (IOException e) {
            System.out.println("🛑 Oh no! Couldn't write to the file. " + e.getMessage());
        }
    }

    public void loadScore() {
        System.out.println("\n📖 Reading the saved score from " + fileName + "...");

        // We use FileReader and BufferedReader to read text from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("💾 Found saved data: " + line);
        } catch (IOException e) {
            System.out.println("🛑 Oh no! Couldn't read the file. Maybe it doesn't exist yet? " + e.getMessage());
        }
    }
}
