package InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz :");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}