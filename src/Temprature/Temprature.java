package Temprature;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Celsius cinsinden sıcaklık giriniz :");

        double celcius = scanner.nextDouble();
        double fahrenheit = celcius * 9 / 5 + 32;

        System.out.println("Celcius:" + celcius + " - " + "Fahrenhei :" + fahrenheit);
        scanner.close();
    }
}
