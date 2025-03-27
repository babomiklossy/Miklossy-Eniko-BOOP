package lab3_ex5;
import java.util.Scanner;

public class AfisareCifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un numar: ");
        int n = scanner.nextInt();

        System.out.println("Cifrele numarului sunt:");
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }

        scanner.close();
    }
}
