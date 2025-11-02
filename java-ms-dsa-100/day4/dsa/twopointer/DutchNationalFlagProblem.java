package day4.dsa.twopointer;

public class DutchNationalFlagProblem {

    public static void main(String[] args) {
          int [] arr = new int[]{  2,0,2,1,1,0  };
    sortColors(arr);
    for(int num:arr){
        System.out.print(num);
    }  
    }


    static void sortColors(int [] arr){
        int high=arr.length-1;
        int low = 0;
        int mid=0;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
                
            }
        }
    }
}
