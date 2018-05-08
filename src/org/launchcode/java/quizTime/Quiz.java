package org.launchcode.java.quizTime;


import java.util.ArrayList;
import java.util.HashMap;


public class Quiz{
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(createMultipleChoice());
        questions.add(createTrueFalse());

        for (Question question : questions) {
            displayQuestion(question);
        }
    }

    public static MultipleChoice createMultipleChoice() {
        HashMap<String, Boolean> mc1Answers = new HashMap<>();
        mc1Answers.put("One", false);
        mc1Answers.put("14", false);
        mc1Answers.put("Four", true);
        mc1Answers.put("Six", false);
        MultipleChoice mc1 = new MultipleChoice("How many laps around a track equals a mile?", mc1Answers);

        return mc1;
    }

    public static TrueFalse createTrueFalse() {
        TrueFalse tf1 = new TrueFalse("You should always stretch before running to prevent injury.", false);
        return tf1;
    }

    public static void displayQuestion(Question q) {
        System.out.println(q.displayQuestion());
    }

}
