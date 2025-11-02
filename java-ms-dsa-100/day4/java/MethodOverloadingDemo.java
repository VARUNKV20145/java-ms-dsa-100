package day4.java;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
            Calculator calculator = new Calculator();
            System.out.println(calculator.add(5, 6));
            System.out.println(calculator.add(5,6,7));
            System.out.println(calculator.add(5.6, 6.7));
    }

}

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(double a ,double b){
        return (int) (a+b);
    }
    public double add(int a,int b,int c){
        return (double) (a+b+c);
    }
}
