package day5.java.shapesystem;

public class Circle extends Shape implements Drawable{
    private double radius;

    Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }
    
    @Override
    public double area(){
        return PI*radius*radius;
    }

    @Override
    public void draw() {
       System.out.println("Drawing a circle");
    }

    @Override
    double perimeter() {
        return 2*PI*radius;
    }
}
