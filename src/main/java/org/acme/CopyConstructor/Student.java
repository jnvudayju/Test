package org.acme.CopyConstructor;

public class Student {
    int rollNumber;
    int age;
    String name;

    public Student(int rollNumber, int age, String name){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
    }

    public Student(Student s){
        rollNumber = s.rollNumber;
        age = s.age;
        name = s.name;
    }

    void display(){
        System.out.println(rollNumber+" "+age+" "+name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, 17, "Akshat");
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
        Student s3 = new Student(2, 16, "Aman");
        s3.display();
    }

}






