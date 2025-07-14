import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı Giriniz :");
        String name = scanner.nextLine();

        System.out.println("Yaşınızdı Giriniz :");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + " , " + age + " Yaşındasınız!");

        scanner.close();
    }
}