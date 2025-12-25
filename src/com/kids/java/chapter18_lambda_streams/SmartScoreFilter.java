package com.kids.java.chapter18_lambda_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * ⚡ CHAPTER 17: Short & Smart Code (Lambdas & Streams)
 * 
 * As you get better at coding, you might want to write tasks 
 * in a SHORTER and SMARTER way. 🧠
 * 
 * 1. Lambda: A tiny function that doesn't need a name. 
 *    Think of it as a "Quick Logic" shortcut.
 * 
 * 2. Streams: A way to process a whole list of items easily, 
 *    like filtering out low scores or counting high scores!
 */

public class SmartScoreFilter {

        public void processScores() {
                List<Integer> scores = new ArrayList<>();
                scores.add(85);
                scores.add(40);
                scores.add(95);
                scores.add(20);
                scores.add(100);
                scores.add(65);

                System.out.println("📜 All scores in the game: " + scores);

                // --- THE OLD WAY (Lots of code) ---
                // List<Integer> passedScores = new ArrayList<>();
                // for (int score : scores) { if (score >= 50) passedScores.add(score); }

                // --- THE MODERN WAY (Streams & Lambdas!) ---
                System.out.println("\n✨ Let's use magic Streams to filter them...");

                List<Integer> highScores = scores.stream()
                                .filter(score -> score >= 80) // LAMBDA: Only keep scores >= 80
                                .collect(Collectors.toList());

                System.out.println("🔥 Top scores (80+): " + highScores);

                long countFailed = scores.stream()
                                .filter(score -> score < 50) // LAMBDA: Only keep scores < 50
                                .count();

                System.out.println("👻 Number of 'Oopsie' scores (below 50): " + countFailed);

                List<Integer> bonusScores = scores.stream()
                                .map(score -> score + 10) // LAMBDA: Give everyone 10 bonus points!
                                .collect(Collectors.toList());

                System.out.println("🎁 Scores with 10 bonus points each: " + bonusScores);
        }
}
