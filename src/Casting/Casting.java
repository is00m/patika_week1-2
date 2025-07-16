package Casting;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = 0;
        double inputDouble = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Tam sayı giriniz : ");
            try {
                inputInt = scanner.nextInt();
                valid = true;

            } catch (Exception e) {
                System.out.println("Lütfen Tam sayı giriniz.");
                scanner.nextLine();
            }
        }

        valid = false;

        while (!valid) {
            System.out.print("Ondalıklı sayı giriniz : ");
            try {
                inputDouble = scanner.nextDouble();
                valid = true;

            } catch (Exception e) {
                System.out.println("Lütfen Ondalıklı sayı giriniz. (örnek : 20,3)");
                scanner.nextLine();
            }
        }

        double convertedInt = inputInt;
        int convertedDouble = (int) inputDouble;

        System.out.println("Girilen tam sayı: " + inputInt + " → Ondalık hali: " + convertedInt);
        System.out.println("Girilen ondalık sayı: " + inputDouble + " → Tam sayı hali: " + convertedDouble);

        scanner.close();

    }
}
