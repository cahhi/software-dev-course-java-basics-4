package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<String> students = new ArrayList<>();

    String newLine = System.lineSeparator(); //this creates a new line and provides the same exact results on each system

    public void mainMenu() {
        System.out.println(newLine + "Welcome to the student manager!");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View all students");
        System.out.println("4. Exit");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addStudent();
        } else if (choice.equals("2")) {
            removeStudent();
        } else if (choice.equals("3")) {
            viewStudents();
        } else if (choice.equals("4")) {
            System.out.println(newLine + "Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void addStudent() {
        // Prompt the user to enter a new student name (using scanner and I/O methods learned previously,
        // refer to mainMenu() for an example)
        System.out.println("Please enter the new student's name: ");
        String name = scanner.nextLine();
        // Add the student to the list
        students.add(name);

        mainMenu();
    }

    public void removeStudent() {
        // Prompt the user for a student name
        System.out.println("Please enter the name of the student you want to remove: ");
        String name = scanner.nextLine();
        // Use the contains method to check if the student entered is in the list
        // If so, remove it, if not, print "Student not found."

        if (students.contains(name)) {
            students.remove(name);
            System.out.println(newLine + name + " removed from the list of students.");

        } else {
            System.out.println(newLine + "Student not found");
        }

        mainMenu();
    }

    public void viewStudents() {
        // Loop through the list of students and print each one
        // (Use a for-each loop!)
        System.out.println(newLine + "STUDENTS: ");
        for (String student : students) {
            System.out.println(student);
        }
        mainMenu();
    }
}
