package org.launchcode.java.quizTime;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;


public class MultipleChoice extends Question {

    private HashMap<String, Boolean> answers;

    public MultipleChoice(String question, HashMap<String, Boolean> answers) {
        super(question);
        this.answers = answers;
    }

    public String displayQuestion() {
        String text = "";
        int index = 1;
        text += question + "\n";
        for (String key : answers.keySet()) {
            text += "\t" + index + ": " + key + "\n";
            index++;
        }
        return text;
    }

    @Override
    public String toString() {
        String text = "";
        text += question + "\n";
        for (String key : answers.keySet()) {
            text += "\t" + key + " - " + answers.get(key) + "\n";
        }
        return text;
    }
}