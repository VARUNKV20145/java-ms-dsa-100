package day3.dsa.Recursion;

public class NumbersUptoN {
    public static void main(String[] args) {
        int n=100;
        display(n);
    }

    public static void display(int n){
        if(n==0){
            return;
        }

        display(n-1);
        System.out.println(n);
    }
}
