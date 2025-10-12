package dsa.day1;
import java.util.Scanner;
public class AsscendingArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array : ");
        for(int num:arr){
            System.out.print(num);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(checkAsscending(arr)?"Asscending Order" : "Not Asccending Order");
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken : " + (endTime-startTime) + "ms");
        sc.close();
    }

    static boolean checkAsscending(int [] arr){
        for(int i=0;i<arr.length-2;i++){
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
