package dsa.arrays;

import java.util.Scanner;

public class LargestElementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        long startTime = System.currentTimeMillis();

        System.out.println("The Largest element in the array is " + findLargestElement(arr));
        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken : " + (endTime-startTime) + "ms");

        sc.close();

    }

    static int findLargestElement(int[] arr) {

        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

}
