package day8.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        System.out.println(removeDuplicates("apple"));
    }

    public static String removeDuplicates(String str){
        Set<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (!charSet.contains(c)) {
                charSet.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
