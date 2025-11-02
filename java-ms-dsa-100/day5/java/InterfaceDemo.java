package day5.java;

public class InterfaceDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.getShape();
        circle.greet();
        Shape.shapeProp();

        Shape rec = new Rectangle();
        rec.getShape();
        rec.greet();

    }
    
}

interface Shape{

    double pi=3.14;
    
    default void getShape(){
        System.out.println("Default method");
    }
    static void shapeProp(){
        System.out.println("This is shape static method");
    }

    void greet();



}


class Circle implements Shape{
    @Override
    public void greet(){
        System.out.println("greetings from circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void greet(){
        System.out.println("Greetings from Rectangle");
    }
    @Override
    public void getShape(){
        System.out.println("Recatangle");
    }
}
