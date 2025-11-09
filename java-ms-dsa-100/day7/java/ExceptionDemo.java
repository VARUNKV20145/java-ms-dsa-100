package day7.java;

public class ExceptionDemo {
    
    public static void main(String [] args){
        int a = 5;
        int b=0;
        int c=0;
        try{
            System.out.println("try block 1");
           c=  a/b;
           System.out.println("try block 2");
        }catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("catch block");
            System.out.println(e.getMessage());
            c=1;
        } finally{
            c=100;
            System.out.println("finally block");
        }
        System.out.println("c : "+c);
    }
}
