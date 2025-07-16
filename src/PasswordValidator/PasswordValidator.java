package PasswordValidator;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifre giriniz: ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Geçersiz Şifre.");
            return;
        }

        boolean hasNoSpace = !password.contains(" ");
        boolean startsWithUppercase = Character.isUpperCase(password.charAt(0));
        boolean endsWithQuestionMark = password.charAt(password.length() - 1) == '?';

        if (hasNoSpace && startsWithUppercase && endsWithQuestionMark) {
            System.out.println("Geçerli Şifre.");
        }else{
            System.out.println("Geçersiz Şifre.");
        }
    }
}
