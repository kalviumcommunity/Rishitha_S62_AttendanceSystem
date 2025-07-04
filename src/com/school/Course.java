package com.school;

public class Course {
    private static int courseIdCounter = 101; // Static variable to keep track of the next course ID
    int courseId;
    String courseName;

    public Course(String courseName) {
        this.courseId = courseIdCounter++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}