import java.util.Scanner;

public class ArithmeticOperationsAndPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk Sayınızı Giriniz :");
        int a = scanner.nextInt();

        System.out.println("İkinci Sayınızı Giriniz :");
        int b = scanner.nextInt();

        System.out.println("Üçüncü Sayınızı Giriniz :");
        int c = scanner.nextInt();

        int result = a + (b * c) - b;

        System.out.println("Sayılarınızın Toplamı :" + result);

        scanner.close();
    }
}
