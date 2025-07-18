package Exponentiation;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayısını girin: ");
        int base = scanner.nextInt();

        System.out.print("Üs sayısını girin: ");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç: " + power(base, exponent));

    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }

    }
}
