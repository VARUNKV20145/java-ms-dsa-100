package day4.java;
import java.util.Scanner;
public class MethodOverridingDemo {


        public Bank getBank(int op){

        return switch(op){
            case 1 -> new SBI();
            case 2 -> new CanaraBank();
            case 4 -> new CanaraBank();
            default -> new Bank();
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bank Interest Calculator =====");
        System.out.println("Choose Bank:");
        System.out.println("1. SBI\n2. Canara \n3. Bank Of Baroda");
        int choice = sc.nextInt();
        System.out.println("Enter the Principle Amount");
        double principle = sc.nextDouble();
        System.out.println("Enter the no of years");
        int roi = sc.nextInt();
        MethodOverridingDemo demo = new MethodOverridingDemo();
        Bank b = demo.getBank(choice);
        System.out.println("Selected Bank :" + b.getClass().getSimpleName());
        System.out.println("Rate of Interest :" + b.getRateOfInterest()+"%");
        System.out.println("Interest Amount : " + ((principle*b.getRateOfInterest())/100)*roi);
        System.out.println("Total Years :" +roi);
        double total = principle+((principle*b.getRateOfInterest())/100)*roi;
        System.out.println("Total Amount : "+total );
        sc.close();
    }

}

 class Bank{
    public double getRateOfInterest(){
        return 0.00;
    }

}

class CanaraBank extends Bank{
    @Override
    public double getRateOfInterest(){
        return 6.66;
    }

}

class BankOfBaroda extends Bank{
    @Override
    public double getRateOfInterest(){
        return 5.66;
    }
}

class SBI extends Bank{
    @Override
    public double getRateOfInterest(){
        return 7.11;
    }
}

