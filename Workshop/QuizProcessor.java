package com.quizplatform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

class QuizProcessor {
    private String[] correctAnswers;
    private List<Integer> scores;

    public QuizProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.scores = new ArrayList<>();
    }

    public int calculateScore(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Mismatch in number of answers submitted.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }

        scores.add(score);  // Store the user score
        return score;
    }

    public String getGrade(int score) {
        if (score == correctAnswers.length) return "A+";
        if (score >= correctAnswers.length * 0.8) return "A";
        if (score >= correctAnswers.length * 0.6) return "B";
        if (score >= correctAnswers.length * 0.4) return "C";
        return "Fail";
    }

    public List<Integer> getAllScores() {
        return scores;
    }
}




//package com.quizplatform;


class Main{
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        QuizProcessor qp = new QuizProcessor(correctAnswers);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your answers (5 questions, choices A/B/C/D):");
        String[] userAnswers = new String[correctAnswers.length];

        for (int i = 0; i < correctAnswers.length; i++) {
            System.out.print("Q" + (i + 1) + ": ");
            userAnswers[i] = scanner.nextLine().trim().toUpperCase();
        }

        try {
            int score = qp.calculateScore(userAnswers);
            String grade = qp.getGrade(score);
            System.out.println("\nScore: " + score + "/" + correctAnswers.length);
            System.out.println("Grade: " + grade);
        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}