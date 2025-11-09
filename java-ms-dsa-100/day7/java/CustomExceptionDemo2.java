package day7.java;

public class CustomExceptionDemo2 {
    public static void main(String[] args) {
        int a=1000;
        try{
            if(a<0){
                throw new NegativeNumberException("Negative Number");
            }else if(a>100){
                throw new TooLargeNumberException("Too large Number");
            }
        }catch(NegativeNumberException e){
            System.out.println(e.getMessage());
            try{
            throw new NegativeNumberException("try again");
            }catch(NegativeNumberException ne){
                System.out.println(ne.getMessage());
            }
        } catch(TooLargeNumberException te){
            System.out.println(te.getMessage());
        }
    }
    
}

class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}

class TooLargeNumberException extends RuntimeException{
    TooLargeNumberException(String msg){
        super(msg);
    }
}
