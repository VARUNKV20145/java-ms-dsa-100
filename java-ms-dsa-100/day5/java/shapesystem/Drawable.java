package day5.java.shapesystem;

public interface Drawable {
    double PI=3.14;
    void draw();
    default void description(){
        System.out.println("General Description about the shape");
    }
}
