package lab3_ex2;

import java.util.Scanner;

public class TipTriunghi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti latura a: ");
        int a = scanner.nextInt();
        System.out.print("Introduceti latura b: ");
        int b = scanner.nextInt();
        System.out.print("Introduceti latura c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triunghi echilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triunghi isoscel");
            } else {
                System.out.println("Triunghi scalen");
            }
        } else {
            System.out.println("Nu se poate forma un triunghi.");
        }
        scanner.close();
    }
}

