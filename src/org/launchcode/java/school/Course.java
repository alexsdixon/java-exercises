package org.launchcode.java.school;

import java.util.HashMap;

public class Course {

    private String courseName;
    private int numberOfStudents;
    private HashMap<Integer, Double> studentGrades = new HashMap<>();
    public final int credit;

    public String getCourseName() {
        return courseName;
    }

    private void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    private void setNumberOfStudents(int aNumberOfStudents) {
        numberOfStudents = aNumberOfStudents;
    }

    public HashMap<Integer, Double> getStudentGrades (){
        return studentGrades;
    }

    private void setStudentGrades(HashMap<Integer, Double> aStudentGrades ) {
        studentGrades = aStudentGrades;
    }



}
