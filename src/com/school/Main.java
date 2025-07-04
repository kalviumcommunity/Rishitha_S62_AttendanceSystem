package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendace System");
        
        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");


        Course course1 = new Course("CS101 - Intro to Programming");
        Course course2 = new Course("MA202 - Linear Algebra");

        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();
        course2.displayDetails();

        System.out.println("\nSession 2: Core Domain Modelling Complete.");

        System.out.println("New Student is added");
        Student student3 = new Student("New Student");
        
        Course course3 = new Course("New Course");
        student3.displayDetails();
        course3.displayDetails();

        System.out.println("\nSession 3: Constructor initialization and Auto-ID generation completed.");
    }
}
