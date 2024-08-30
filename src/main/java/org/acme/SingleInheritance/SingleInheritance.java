package org.acme.SingleInheritance;


class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("bark...");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Animal animal1 = new Dog();
        animal1.eat();


    }
}
