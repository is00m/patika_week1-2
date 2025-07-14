package EvenNumberAndAverageOfNumbers;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        System.out.println("0'dan " + number + "'e kadar olan çift sayılar:");
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
