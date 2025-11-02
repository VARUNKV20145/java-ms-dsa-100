package day4.dsa.twopointer;


public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(arr);
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }

    static int removeDuplicates(int [] arr){

        if(arr.length==0) return 0;

        int left = 0, right=left+1;

        while(right<arr.length){
            while(right < arr.length && arr[left]==arr[right]){
                right++;
            }

            if(right<arr.length){
            arr[++left]=arr[right];
            }
        }
        return left+1;
        }
    }

