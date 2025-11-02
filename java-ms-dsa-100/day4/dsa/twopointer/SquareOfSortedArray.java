package day4.dsa.twopointer;
import static java.lang.Math.abs;
public class SquareOfSortedArray {
    public static void main(String[] args) {
        int [] arr = new int[] {-7, -4, -1, 2, 3};
        arr = squareSort(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }

    static int[] squareSort(int [] arr){
        int [] result = new int[arr.length];
        int pos=result.length-1;
        int left=0;
        int right = arr.length-1;

        while(left<=right){
        
            int leftSquare = arr[left]*arr[left];
            int rightSquare = arr[right]*arr[right];
            if(leftSquare>rightSquare){
                result[pos]=leftSquare;
                left++;
            } else{
                result[pos]=rightSquare;
                right--;
            }
            pos--;


        }
       return result;
    }
}
