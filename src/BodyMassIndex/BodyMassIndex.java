package BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double m = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        int kg = scanner.nextInt();

        double massIndex = kg / (m * m);

        System.out.println("Vücut Kitle İndeksiniz : " + massIndex);
        scanner.close();
    }
}
