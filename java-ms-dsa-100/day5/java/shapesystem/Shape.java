package day5.java.shapesystem;

public abstract class Shape {

    private String color;

    Shape(String color ){
        this.color=color;
    }
    abstract double  area();
   abstract  double perimeter();

   void displayColor(){
    System.out.println("Color : "+this.color);
   }

    
}
