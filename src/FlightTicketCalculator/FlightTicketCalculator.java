package FlightTicketCalculator;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz (km): ");
        int km = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk Tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int type = scanner.nextInt();

        if (km <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double perPrice = 0.10;
        double totalPrice = km * perPrice;

        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = 0.50;
        } else if (age <= 24) {
            ageDiscount = 0.10;
        } else if (age > 65) {
            ageDiscount = 0.30;
        }

        totalPrice -= totalPrice * ageDiscount;

        if (type == 2) {
            totalPrice -= totalPrice * 0.20;
            totalPrice *= 2;
        }

        System.out.println("Toplam Tutar = " + totalPrice +" TL");
        scanner.close();
    }
}
