package day3.dsa.Recursion;
import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        // for(int i=0;i<limit;i++){
        //    System.out.print(fibanocci(i) +",");
        // }
        int a = 0,b=1,c=0;
        System.out.print(a+","+b);
        for(int i=2;i<limit;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
        sc.close();
    }

    static int fibanocci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibanocci(n-1)+fibanocci(n-2);
    }


}
