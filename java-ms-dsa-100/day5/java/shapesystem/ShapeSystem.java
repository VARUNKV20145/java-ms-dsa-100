package day5.java.shapesystem;

public class ShapeSystem {
    
    public static void main(String[] args) {
        
        Shape [] shapes = new Shape[2];
        shapes[0]= new Circle(6.88, "YELLOW");
        shapes[1]=new Rectangle(5.7, 8.95, "blue");
        for(Shape shape:shapes){
            System.out.println("Area : "+shape.area());
            System.out.println("Perimeter :"+shape.perimeter());
            shape.displayColor();
            if (shape instanceof Drawable drawable){
                drawable.description();
                drawable.draw();
            }
        }
    }
}
