package com.designPatterns.PrototypePattern.Example2;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student("Ram", 30, "M");
        Student clonedStudent = student.clone();

        System.out.println("Original Student: " + student);
        System.out.println("Cloned Student: " + clonedStudent);
    }
}
