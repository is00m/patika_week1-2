package FindMinMax;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı girilecek: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            scanner.close();
            return;
        }

        int min = 0;
        int max = 0;

        System.out.print("1. sayıyı giriniz: ");
        int number = scanner.nextInt();
        min = number;
        max = number;

        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = scanner.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("En Küçük Sayı: " + min);
        System.out.println("En Büyük Sayı: " + max);

        scanner.close();
    }
}