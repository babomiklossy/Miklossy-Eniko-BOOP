package lab3_ex1;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int a = scanner.nextInt();
        System.out.print("Introducetial doilea numar: ");
        int b = scanner.nextInt();
        System.out.print("Introducei al treilea numar: ");
        int c = scanner.nextInt();
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimul este: " + min);
        scanner.close();
    }
}
