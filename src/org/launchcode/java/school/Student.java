package org.launchcode.java.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
    }



    public String getName() {

        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {

        return studentId;
    }

    private void setStudentId(int aStudentId) {

        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }


}

