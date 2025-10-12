package dsa.day1;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SearchAndCount {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Input Array");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> frequencyMap = getFrequencyCount(arr); 
        for(Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }
    static Map<Integer,Integer> getFrequencyCount(int [] arr){
        Map<Integer,Integer> frMap = new HashMap<>();
        for(int num : arr){
            frMap.put(num, frMap.getOrDefault(num, 0)+1);
        }
        return frMap;
    }
}
