package lab2_ex5;

import java.util.Scanner;
public class CalculFunctie {
    public static double f(double x) {
        if (x > 2) {
            return x * x + 5;
        } else if (x == 2) {
            return 0;
        } else {
            return x + x * x;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducei valoarea lui x: ");
        double x = scanner.nextDouble();
        System.out.println("Valoarea functiei f(x) este: " + f(x));
        scanner.close();
    }
}
