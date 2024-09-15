package com.ucsc.automation.theory;

class Fruit{}

class Banana extends Fruit{}

class Monkey{
    public void eat(Fruit fruit){
        System.out.println("Monkey is eating Fruit");
    }

    public void eat(Banana banana){
        System.out.println("Monkey is eating Banana");
    }
}

public class StaticBindingEx {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Banana banana = new Banana();
        Fruit fruitBanana = new Banana();

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();

        m1.eat(fruit);
        m2.eat(banana);
        m3.eat(fruitBanana);
    }
}
