package day8.java;


public class ReverseSentence {
    public static void main(String[] args) {

        Sentence s = new Sentence(null);
        s.reverseSentence();
        System.out.println(s);

        
    }
    
}

class Sentence{
    private String sentenceString;
    //constructor
    public Sentence(String sentenceString){
        this.sentenceString=sentenceString;
    }
    //getters and setters
    public String getSenetence(){
        return this.sentenceString;
    }
    public void setString(String sentenceString){
        this.sentenceString=sentenceString;
    }

    @Override
    public String toString(){
        return this.sentenceString;
    }
    public void reverseSentence(){
        if(this.sentenceString==null||this.sentenceString.isBlank()) 
        return;
        String [] str = this.sentenceString.split(" ");
        int left=0;
        int right =str.length-1;
        while (left<right) {
            String temp = str[right];
            str[right]=str[left];
            str[left]=temp;
            left++;
            right--;
        }
        this.sentenceString = String.join(" ",str);
    }
}