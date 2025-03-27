package lab3_ex4;
import java.util.Scanner;

public class SumaPatrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        System.out.println("Suma patratelor primelor " + n + " numere naturale este: " + suma);
        scanner.close();
    }
}
