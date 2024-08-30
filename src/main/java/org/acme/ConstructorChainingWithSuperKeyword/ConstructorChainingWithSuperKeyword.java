package org.acme.ConstructorChainingWithSuperKeyword;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person{
    float salary;

    Employee(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }
}

public class ConstructorChainingWithSuperKeyword {
    public static void main(String[] args) {
        Employee employee = new Employee("ram", 898757665, 800000000);
        System.out.println(employee.name+" "+employee.age+" "+employee.salary);
    }

}
