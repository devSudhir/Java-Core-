package com.sudhir.oop;

public class Student {
    public int studentId;
    public String studentName;
    public int age;

    public void studentReading(){
        System.out.println(studentName + " is reading currently");
    }

    public void studentFullDetails(){
        System.out.println("Id : " + studentId + " , name : " + studentName + " , age : " + age);
    }
}
