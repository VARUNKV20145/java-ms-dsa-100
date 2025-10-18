package day2.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int index = binarySearch(0, arr.length - 1, arr, target);
        System.out.println(target + " found at " + index);
        sc.close();
    }

    static int binarySearch(int left, int right, int[] arr, int target) {
        System.out.println("iterating");
            int mid = (right + left)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
               return binarySearch(mid + 1, right, arr, target);
            } else {
                return binarySearch(left, mid - 1, arr, target);
            }
    }
}
