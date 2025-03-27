package lab2_ex6;

import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr (1-12): ");
        int n = scanner.nextInt();

        if (n > 0 && n < 13) {
            System.out.println(n + "! = " + factorial(n));
        } else {
            System.out.println("Numărul trebuie să fie între 1 și 12!");
        }

        scanner.close();
    }
}