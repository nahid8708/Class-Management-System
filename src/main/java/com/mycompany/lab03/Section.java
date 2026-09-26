
package com.mycompany.lab03;

public class Section {

    String name;
    String[] courses = {"OOP", "EC"};
    Student student1 = new Student();

    void showStudentInfo() {

        student1.name = "Tanzim";
        student1.displayInfo();
    }
}