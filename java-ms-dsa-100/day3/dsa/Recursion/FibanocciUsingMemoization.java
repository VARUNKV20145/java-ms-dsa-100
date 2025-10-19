package day3.dsa.Recursion;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class FibanocciUsingMemoization {

    static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.print(" " + fibanocci(i));
        }
        sc.close();
    }

    static int fibanocci(int n) {
        if (n <= 1)
            return n;
        if (!cache.containsKey(n)) {
            cache.put(n, fibanocci(n - 1) + fibanocci(n - 2));
        }

        return cache.get(n);

    }
}
