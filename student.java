package com.codealpha.studenttracker;

public class Student {

    // Data Members
    private int rollNo;
    private String name;
    private double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter Methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Grade Calculation
    public String getGrade() {

        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    @Override
    public String toString() {
        return String.format(
                "%-10d %-20s %-10.2f %-10s",
                rollNo,
                name,
                marks,
                getGrade());
    }
}
