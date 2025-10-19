package day3.dsa.Recursion;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        double fact = factorial(n);
        System.out.println(n+"! = "+fact);
        sc.close();
    }

    static double factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
