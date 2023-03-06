package com.sudhir.oop;

public class Main {

    public static void main(String[] args) {
	// Creating Student instance

        Student s1 = new Student();
        s1.studentName = "dev sudhir";
        s1.studentId = 1;
        s1.age = 20;

        s1.studentReading();
        s1.studentFullDetails();
    }
}
