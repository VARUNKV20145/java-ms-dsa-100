package day8.java;

public class CompressedString {
    
    public static void main(String[] args) {
        System.out.println(compresseString("aabbccc"));
    }

    public static String compresseString(String str){
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int pos = 0;
        char [] strChar = str.toCharArray();
        while(left<str.length()){
            while( pos<str.length() && strChar[left] == strChar[pos]) 
            {
                pos++;
            }
            sb.append(strChar[left]);
            sb.append(pos-left);
            left = pos;
        }
        return sb.toString().length()<str.length() ? sb.toString() : str;
    }
}
