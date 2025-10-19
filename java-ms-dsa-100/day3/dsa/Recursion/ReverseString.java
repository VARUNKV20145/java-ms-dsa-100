package day3.dsa.Recursion;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
       // System.out.println("Reversed String :" +reverse("",word));
        System.out.println("Reversed String " + reverse(word.toCharArray(), 0, word.length()-1));
        sc.close();
    }
    static String reverse(String revString,String word){
        if(word.length()==0){
            return revString;
        }
        String lastLetter = String.valueOf(word.charAt(word.length()-1));
        String subStr = word.substring(0, word.length()-1);
        String revString2 = revString+lastLetter;
        return reverse(revString2, subStr);
    }
    static String reverse(char [] wordArr,int left,int right){

        if(left>=right){
            return new String(wordArr);
        }

       char temp=wordArr[left];
        wordArr[left] = wordArr[right];
        wordArr[right] = temp;
        
       return  reverse(wordArr, ++left, --right);
    }
}
