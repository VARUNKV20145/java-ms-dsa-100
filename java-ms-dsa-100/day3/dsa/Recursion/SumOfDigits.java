package day3.dsa.Recursion;
import java.util.Scanner;
public class SumOfDigits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Sum :"+sumOfDigit(n));
        sc.close();
    }
    static int sumOfDigit(int n){
        if(n<=0){
            return 0;
        }

        return n%10+sumOfDigit(n/10);
    }
}
