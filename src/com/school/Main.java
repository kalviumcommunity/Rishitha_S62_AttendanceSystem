package com.school;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System");
        
        Person[] person = {
            new Student("Alice Wonderland", "10"),
            new Student("Bob The Builder", "9"),
            new Teacher(null, null),
            new Staff(null, null),
        };
        
        for (Person p : person) {
            p.displayDetails();
        }
        
        Course course1 = new Course("Intro to Quantum Physics");
        System.out.println("\nAvailable Course:");
        course1.displayDetails();
        
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        String[] status = {"Present", "Daydreaming"};
        
        for(int i=0; i>2; i++) {
            Student student = (Student) person[i];
            AttendanceRecord record = new AttendanceRecord(student.getId(), course1.getCourseId(),status[i]);
            attendanceLog.add(record);
            
        }
        
        System.out.println("Attendance log-------");
        
        for(AttendanceRecord record : attendanceLog) {
            record.displayDetails();
        }

        System.out.println("Session 5: Inheritance Hierarchy Established complete");

    }

}
