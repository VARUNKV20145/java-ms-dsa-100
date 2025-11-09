package day7.java;

public class CustomExceptionDemo {
public static void main(String[] args) {
    

    int a=1; int b=0;
    SimpleCalculator c = new SimpleCalculator();
    double result=0;
    try{
         result = c.divide(a, b);
         System.out.println(result);
         result = c.add(a, b);

         System.out.println(result);

         result= c.multiply(a, b);
        System.out.println(result);
         result = c.subtract(a, b);
         System.out.println(result);
    }catch(DivideByZeroException e){
        System.out.println("Division By Zero Not Allowed");
    } catch(ArithmeticException ar){
        System.out.println(ar.getMessage());

    }
}
    
}

class DivideByZeroException extends Exception{
    DivideByZeroException(String msg){
        super(msg);
    }
}

 class SimpleCalculator{
    public double add (double a,double b){
        return a+b;
    }

    public double subtract(double a,double b){
        return a-b;

    }

    public double multiply(double a , double b){
        return a*b;
    }
    public double divide (double a,double b) throws DivideByZeroException{
        if (b==0) {
            throw new DivideByZeroException("Division By Zero is not allowed");
        }
        return a/b;
    }
}
