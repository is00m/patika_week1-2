import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz :");
        double radius = scanner.nextDouble();

        double area = radius * radius * Math.PI; // pi sayısını istersek kendimiz de yapabiliriz ama hazırda var. ÖRN(double PI = 3.14159)
        double cercumference = Math.PI + radius * 2;

        System.out.println("Dairenin alanı :" + area);
        System.out.println("Dairenin çevresi :" + cercumference);
        scanner.close();
    }
}
