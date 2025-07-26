package com.school;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    //    Session 6
        System.out.println("--- School Attendance System ---");

        // --- Data Setup ---
        List<Student> students = Arrays.asList(
            new Student("Alice Wonderland", "Grade 10"),
            new Student("Bob The Builder", "Grade 9")
        );

        List<Course> courses = Arrays.asList(
            new Course("Intro to Quantum Physics"),
            new Course("Advanced Algorithms")
        );

        List<AttendanceRecord> attendanceLog = Arrays.asList(
            new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"),
            new AttendanceRecord(students.get(1).getId(), courses.get(0).getCourseId(), "Absent"),
            new AttendanceRecord(students.get(0).getId(), courses.get(1).getCourseId(), "Present")
        );

        // --- Displaying Data ---
        System.out.println("\n--- School Personnel & Course Details ---");

        System.out.println("Students:");
        students.forEach(Student::displayDetails);

        System.out.println("\nCourses:");
        courses.forEach(Course::displayDetails);

        System.out.println("\nAttendance Log (Initial):");
        attendanceLog.forEach(t -> t.displayDetails());

        // --- Saving Data ---
        System.out.println("\n--- Saving Data to Files ---");
        FileStorageService storageService = new FileStorageService();

        System.out.println("helloooooo"+storageService);

        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(attendanceLog, "attendance_log.txt");


        System.out.println("\nSession 6: Interface-Driven Persistence (Saving) Complete.");
        System.out.println("Check students.txt, courses.txt, and attendance_log.txt for output.");
    }

}