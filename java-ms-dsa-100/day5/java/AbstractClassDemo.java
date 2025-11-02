package day5.java;



public class AbstractClassDemo {
    
    public static void main(String[] args) {
        Animal cow = new Cow("Cow");
        System.out.println(Animal.population);
        Animal cat = new Cat("Cat");
                System.out.println(Animal.population);

        cow.getName();
        cow.getSound();
        cat.getName();
        cat.getSound();
        Animal.incrementPopulation();
                System.out.println(Animal.population);


    }
}


abstract class Animal{
    String name;
    static int population;
    {
        System.out.println("Static block");
        population++;
    }
    Animal(String name){
        System.out.println("Constructor");
        this.name = name;
    }

    public void getSound(){};//abstract

    public void getName(){
        System.out.println(this.name);
    }

    public static void incrementPopulation(){
        population++;
    }
}

class Cat extends Animal{

    @Override
    public void getSound(){
        System.out.println("Meow");
    }

    Cat(String name){
        super(name);
    }
}


class Cow extends Animal{
    @Override
    public void getSound(){
        System.out.println("Baaa");
    }

    Cow(String name){
        super(name);
    }
}
