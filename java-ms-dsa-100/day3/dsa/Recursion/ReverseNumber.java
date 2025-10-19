package day3.dsa.Recursion;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int reverseNum = reverse(num,0);
        System.out.println(reverseNum);
        sc.close();
    }
    static int reverse(int num,int n){
        if(num==0)
        return n;
        return reverse(num/10, (n*10)+num%10);
    }
}
