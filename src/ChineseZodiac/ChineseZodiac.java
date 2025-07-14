package ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int birthYear = scanner.nextInt();

        String[] chineseZodiac =
                {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int index = birthYear % 12;
        String horoscope = chineseZodiac[index];

        System.out.println("Çin Zodyağı Burcunuz : "+ horoscope);
        scanner.close();
    }
}
