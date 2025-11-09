package day7.java;

public class ThrowsDemo {
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        try{
        System.out.println(c.divide(1, 0));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}

class Calculator
{
    public double divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Divide by Zero not allowed");
        }
        return a/b;
    }
}
