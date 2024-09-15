package com.ucsc.automation.theory;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
//    @Override
    public void eat(){
        System.out.println("Dog is eating...");
    }
}

public class OverrideEx {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Animal animalDog = new Dog();
        animalDog.eat();
    }
}
