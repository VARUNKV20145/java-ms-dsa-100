package dsa.arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the Array");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();

        int [] indices = findIndices(arr,target);
        System.out.print("[");
        for(int num : indices){
            System.out.print(num+",");
        }
                System.out.print("]");
        sc.close();

    }

    static int[] findIndices(int [] arr,int target){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(frequencyMap.containsKey(target - arr[i])){
                return new int[]{i,frequencyMap.get(target - arr[i])};
            }else{
                frequencyMap.put(arr[i], i);
            } 
        }
        return new int[]{-1,-1};
    }
}
