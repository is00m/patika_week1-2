package Round;

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yuvarlanacak Ondalık sayıyı giriniz (virgün ile giriniz): ");

        double inputDouble = scanner.nextDouble();

        System.out.println("Input: "+ inputDouble);
        System.out.println("Aşağı Yuvarlama: "+ Math.floor(inputDouble));
        System.out.println("Yukarı Yuvarlama: "+ Math.ceil(inputDouble));
        System.out.println("En Yakın Tam Sayı "+ Math.round(inputDouble));

    }
}
