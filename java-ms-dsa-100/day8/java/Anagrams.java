package day8.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        
  System.out.println(isAnagramUsingMap("Dormitory", "Dirty room")); // true
        System.out.println(isAnagramUsingMap("Listen", "Silent"));        // true
        System.out.println(isAnagramUsingMap("Listen", "Silene"));        // false
    }


    public static boolean isAnagram(String s1, String s2){
        boolean isAnagram = true;

        if(s1.length()!=s2.length()){
            isAnagram = false;
        } else{
            char[] str1 = s1.toLowerCase().replaceAll("\\s+","").toCharArray();
            char [] str2 = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(!(new String(str1).equalsIgnoreCase(new String(str2)))){
                isAnagram=false;
            }

        }

        return isAnagram;


    }

    public static boolean isAnagramUsingMap(String s1,String s2){
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");
        boolean isAnagram = false;
        if(s1.length()!=s2.length()){
            isAnagram=false;
        } else{
       
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char s : s1.toCharArray()){
            freqMap.put(s,freqMap.getOrDefault(s,0)+1);
        }

        for(char s : s2.toCharArray() ){
            if(!freqMap.containsKey(s)){
                isAnagram=false;
                break;
            } else{
                freqMap.put(s, freqMap.get(s)-1);
                if (freqMap.get(s) < 1) {
                    freqMap.remove(s);
                }
            }


        }

        if(freqMap.isEmpty()){
            isAnagram=true;
        }
    }

    return isAnagram;

    }
}
