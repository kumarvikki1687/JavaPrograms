package OOPS.Inheritance;

/*
When child class acquires all the properties and behaviour of a parent class
 */

class Animal {
    void eat() {System.out.println("eating...");}
}

class Dog extends Animal{
    void bark() {System.out.println("barking...");}
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
