package by.itstep.gulik.controller;

import by.itstep.gulik.model.data.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 19, 10, true);
        Student student2 = new Student("Anna");
        Student student3 = new Student(true);
        Student student4 = new Student();

        Student student5 = new Student(student1);
        Student student6 = new Student(student1);
        Student student7 = new Student(student1);
        Student student8 = new Student(student1);


        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());
        System.out.println(student6.getInfo());
        System.out.println(student7.getInfo());
        System.out.println(student8.getInfo());



    }
}
