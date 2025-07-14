package FruitShop;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;

        System.out.println("Armut Kaç Kilo ?");
        int armutKg = scanner.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        int elmaKg = scanner.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        int domatesKg = scanner.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        int muzKg = scanner.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        int patlicanKg = scanner.nextInt();

        double total = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Tutar : " + total + " TL");
        scanner.close();
    }
}
