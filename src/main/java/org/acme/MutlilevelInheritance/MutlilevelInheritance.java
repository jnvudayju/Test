package org.acme.MutlilevelInheritance;

class Animal{
    void animal(){
        System.out.println("animal.....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barking....");
    }
}

class ChildDog extends Dog{
    void childbark(){
        System.out.println("child dog is barking....");
    }
}


public class MutlilevelInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animal();

        Dog dog = new Dog();
        dog.bark();
        dog.animal();

        ChildDog childDog = new ChildDog();
        childDog.bark();
        childDog.animal();
        childDog.childbark();
    }
}
