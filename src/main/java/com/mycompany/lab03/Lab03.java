package com.mycompany.lab03;


public class Lab03 {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Fahim";
        student1.id = "252-15-139";
        student1.displayInfo();

        
        Section i_69 = new Section();
        i_69.showStudentInfo();
    }
}

class Student {

    String name, id, section, address;

    void read() {
        System.out.println("Student is reading");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Section: " + section);
        System.out.println("Address: " + address);
    }
}