package day3.dsa.Arrays;

/*Algorithm
--------
Reverse the whole array
Reveres first K elements
Reverse n-k elements
*/

public class RotateArray {
    public static void main(String [] args){
        int [] arr = new int[]{1,2,3,4,5};
        int k=2;
        reverse(arr,0,arr.length-1);
        reverse(arr, 0,k-1);
        reverse(arr, k, arr.length-1);

        for(int num:arr){
            System.out.println(num);
        }


    }

    private static void reverse(int [] arr,int start,int end){

        while(start<end){
            arr[start] = arr[start]+arr[end];
            arr[end] = arr[start]-arr[end];
            arr[start] = arr[start]-arr[end];
            start++;
            end--;
        }

    }
}
