package lab3_ex3;

import java.util.Scanner;

public class CifrePareImpare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducetiun numar: ");
        int n = scanner.nextInt();
        int pare = 0, impare = 0;
        while (n > 0) {
            int cifra = n % 10;
            if (cifra % 2 == 0) {
                pare++;
            } else {
                impare++;
            }
            n /= 10;
        }
        System.out.println("Cifre pare: " + pare);
        System.out.println("Cifre impare:" + impare);
        scanner.close();
    }
}