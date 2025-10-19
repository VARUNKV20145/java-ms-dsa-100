package day3.dsa.Recursion;
import java.util.Scanner;
public class PowerOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int pow = sc.nextInt();
        System.out.println(num+"^"+pow+"= " +power(num,pow));
        sc.close();

    }

    static double power(int num,int pow){
        if(pow<1){
            return (double)1;
        }

        return  num*power(num,--pow);
    }
}
