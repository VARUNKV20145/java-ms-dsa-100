package day5.java.shapesystem;

public class Rectangle extends Shape implements Drawable {

    private double length;
    private double breadth;

    Rectangle(double length,double breadth,String color){
        this.length=length;
        this.breadth=breadth;
        super(color);
    }

    @Override
    public double area(){
        return this.length*this.breadth;
    }
    @Override
    public double perimeter(){
        return 2*this.length*this.breadth;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
    
}
