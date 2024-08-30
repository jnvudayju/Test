package org.acme.Abstraction;

class Employee{
    int id;
    String name;
    Address address;

    Employee(int id , String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display1(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}

class Address{
    String city;
    String state;
    String country;

    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Address address1 = new Address("vns", "up", "India");
        Address address2 = new Address("ddu", "up", "India");

        Employee employee1 = new Employee(1, "ud", address1);
        Employee employee2 = new Employee(2, "md", address2);

        employee1.display1();
        employee2.display1();
    }

}
