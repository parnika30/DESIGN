package com.designPatterns.PrototypePattern.Example2;

public class Student implements Prototype<Student> {
    private String name;
    private int rollNo;
    public String gender;

    // Getters and Setters
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    Student(String name, int rollNo, String gender) {
        this.name = name;
        this.rollNo = rollNo;
        this.gender = gender;
    }


    @Override
    public Student clone() {
        return new Student(this.name, this.rollNo, this.gender);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + ", gender='" + gender + "'}";
    }

    //CLASS SHOULD ALWAYS TAKE CARE OF CLONING LOGIC AND NOT THE CLIENT.
}
