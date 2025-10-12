import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check = "y";
        int operation;
        double num1, num2, result;
        do {
            System.out.println("===== Simple Calculator =====\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit\n" +
                    "Enter your choice:");
            try {
                operation = sc.nextInt();
                if (operation == 5) {
                    break;
                }

                System.out.println("Enter The First Number");
                num1 = sc.nextDouble();
                System.out.println("Enter The Second Number");
                num2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Only Integers allowed");
                sc.next(); // clear invalid input
                continue;
            }
            result = switch (operation) {
                case 1 -> num1 + num2;
                case 2 -> num1 - num2;
                case 3 -> num1 * num2;
                case 4 -> {
                    double temp;
                    if (num2 == 0) {
                        System.out.println("Cannot Divide By Zero");
                        temp = 0;
                    } else {
                        temp = num1 / num2;
                    }
                    yield temp;
                }
                default -> {
                    System.out.println("Invalid Operation");
                    yield 0.0;
                }
            };
            System.out.println("Result:" + result);
            sc.nextLine();
            System.out.println("Do you want to continue? (y/n):");
            check = sc.nextLine();

        } while (check.equals("y") || check.equals("Y"));
        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}