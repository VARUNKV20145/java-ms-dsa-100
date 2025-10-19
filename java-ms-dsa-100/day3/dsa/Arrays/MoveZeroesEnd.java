package day3.dsa.Arrays;

public class MoveZeroesEnd {
    
    public static void main(String[] args){
        int [] arr = new int[]{1,0,2,0,3,0,4,0,5};
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
