package org.acme.ConstructorChaining;

class Student{
    int roll;
    int age;
    String name ;
    String collegeName = "JU";

    Student(int roll, int age, String name){
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    Student(int roll, int age, String name, String collegeName){
        this(roll, age, name);
        this.collegeName = collegeName;
    }

    void display(){
        System.out.println(roll+" "+age+" "+name+" "+collegeName);
    }

}


public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student(1, 16, "Akhil");
        s1.display();
        Student s2  = new Student(2, 18, "Zishan", "Jadavpur University");
        s2.display();
    }
}
