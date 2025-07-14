import java.util.Scanner;

public class ZodyagBurcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int birthYear = scanner.nextInt();

        String[] zodyagHoroscope =
                {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int index = birthYear % 12;
        String horoscope = zodyagHoroscope[index];

        System.out.println("Çin Zodyağı Burcunuz : "+ horoscope);
        scanner.close();
    }
}
