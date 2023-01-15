package com.oop.lectures.lecture2;

class Person {
    private String name;

    public Person() {
    }

    public Person(String name1) {
        name = name1;
    }

    // initialise the name instance field of the object
    public void setName(String name) {
        /* this is a shortcut for the object we are currently in.   Thus, this.name is the instance field name within the  current object */
        this.name = name;
    }

    // prints all information about the object
    public void info() {
        System.out.println("\nname: " + name);
    }
}

class Student extends Person {
    private String school;

    public Student(String school, String name) {
        this.school = school;
        setName(name);
    }

    // prints all information about the object
    public void info() {
        // call info() method of Person class
        super.info();
        System.out.println("school: " + school);
    }
}

class PostGraduateStudent extends Student {
    private String firstDegree; // what the first degree was on \pause

    public PostGraduateStudent(String school, String name, String degree) {
        super(school, name); // call constructor of parent class
        firstDegree = degree;
    }

    public void info() {
        super.info();
        System.out.println("firstDegree: " + firstDegree);
    }
}

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("IC", "John");
        Student s2 = new Student("MIT", "Helen");
        PostGraduateStudent s3 = new PostGraduateStudent(
            "Westminster",
            "George",
            "music");
        s1.info();
        s2.info();
        s3.info();
    }
}

class A {
    public int x;
}

class B extends A {
    public int x;

    void foo() {
        int y = super.x; // accesses x within A, NOT x in B!
    }
}