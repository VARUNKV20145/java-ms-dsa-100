package dsa.arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the array elements");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("original Aray : ");
        for(int num : arr)
        {
            System.out.print(num+",");
        }
        long startTime = System.currentTimeMillis();
        int [] reversedArray = reverseArrayUsingTwoPointers(arr);
        long endTime = System.currentTimeMillis();

  
        System.out.println("Reversed Array : ");
        for(int num: reversedArray){
            System.out.print(num+",");
        }
        System.out.println("\nTimeTaken : "+ (endTime-startTime)+"ms");
        sc.close();
    }

    static int [] reverseArray(int [] arr){
        int [] reversedArray = new int[arr.length];
        int n = arr.length;
        for(int num:arr){
            reversedArray[--n] = num;
        }
        return reversedArray;
    }

    static int [] reverseArrayUsingTwoPointers(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            swap(arr,left++,right--);
        }

        return arr;
    }

    static void swap(int[] arr,int a,int b){
        arr[a] =arr[a]^arr[b];
        arr[b]=arr[a]^arr[b];
        arr[a]=arr[a]^arr[b];
    }

}
