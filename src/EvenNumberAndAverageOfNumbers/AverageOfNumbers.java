package EvenNumberAndAverageOfNumbers;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int total = 0;
        int piece = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                piece++;
            }
        }

        if (piece > 0) {
            double average = (double) total / piece;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("Hiçbir sayı 3 ve 4'e tam bölünmüyor.");
        }
    }
}
