package PrimeChecker;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            if (isPrime(number, 2)) {
                System.out.println(number + " sayısı ASALDIR !");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number, int divisor) {
        if (divisor > number / 2) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }
}
