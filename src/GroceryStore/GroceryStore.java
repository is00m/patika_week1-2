package GroceryStore;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double aubergine = 5;

        System.out.println("Armut Kaç Kilo ?");
        int pearKg = scanner.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        int appleKg = scanner.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        int tomatoKg = scanner.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        int bananaKg = scanner.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        int aubergineKg = scanner.nextInt();

        double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);

        System.out.println("Toplam Tutar : " + total + " TL");
        scanner.close();
    }
}
