package org.launchcode.java.quizTime;


public abstract class Question {
    public String question;
    private boolean hasBeenAsked;
    private boolean isAnsweredCorrectly;

    public Question() {

    }

    public Question(String question) {
        this.question = question;
        hasBeenAsked = false;
        isAnsweredCorrectly = false;
    }

    public abstract String displayQuestion();
}