package day8.java;

public class ReverseString {

    public static void main(String[] args) {
        StringAdvanced sd = new StringAdvanced("Helloworld");
        sd.reverseUsingArray();
        System.out.println(sd);
        StringAdvanced sdb = new StringAdvanced("Helloworld");
        sdb.reverseUsingStringBuilder();
        //here when String is reversed using Array it took 5 iterations 
        //where as String reversed using Stringbuilder took 10 iterations 
        //clearly two pointer iteration wins
        System.out.println(sdb);
    }
    
}

class StringAdvanced{
    String str=null;
    public StringAdvanced(String str)
    {
        this.str=str;
    }

    public String getString(){
        return this.str;
    }
    public void setString(String str){
        this.str=str;
    }

    @Override
    public String toString(){
        return this.str;
    }

    public void reverseUsingArray(){
        int count=0;
        char[] charStr = this.str.toCharArray();
        for(int left=0,right=charStr.length-1;left<right;left++,right--){
            char temp=charStr[left];
            charStr[left]=charStr[right];
            charStr[right]=temp;
            System.out.println(++count);
        }

        setString(String.valueOf(charStr));
    }

    public void reverseUsingStringBuilder(){
                int count=0;

        StringBuilder sb = new StringBuilder();
        for(int right=this.str.length()-1;right>=0;right--){
            sb.append(this.str.charAt(right));
            System.out.println(++count);

        }

        this.str=sb.toString();

    }
}
