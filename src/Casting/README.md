# Pratik - Tip Dönüşümleri (Casting)
**Soru:** Java'da tip dönüşümlerini anlamak için bir program yazınız. Bu program, öncelikle kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini istesin. Daha sonra bu tam sayıyı ondalıklı sayıya dönüştürerek ve bu ondalıklı sayıyı tam sayıya dönüştürerek sonuçları ekrana yazdırsın.

**İpucu 1:** Kullanıcıdan giriş almak için `Scanner` sınıfını kullanabilirsiniz.

**İpucu 2:** Tip dönüşümü yapmak için, dönüştürmek istediğiniz tipi parantez içinde öne koyabilirsiniz. Örneğin, double tipindeki bir değişkeni `int` tipine dönüştürmek için `(int)` ifadesini kullanabilirsiniz.

**İpucu 3:** Tam sayıları ondalıklı sayılara dönüştürdüğünüzde, virgülden sonra her zaman `.0` olacaktır. Örneğin, `5` tam sayısını `double` tipine dönüştürdüğünüzde sonuç `5.0` olacaktır.

**İpucu 4:** Ondalıklı sayıları tam sayılara dönüştürdüğünüzde, virgülden sonraki kısmı kaybedersiniz. Örneğin, `5.99` ondalıklı sayısını int tipine dönüştürdüğünüzde sonuç `5` olacaktır.

Bu ipuçlarını kullanarak, Java'da tip dönüşümlerini uygulamalı bir şekilde gösteren bir program yazabilirsiniz. Bol şanslar!

## Cevap:
    public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = 0;
        double inputDouble = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Tam sayı giriniz : ");
            try {
                inputInt = scanner.nextInt();
                valid = true;

            } catch (Exception e) {
                System.out.println("Lütfen Tam sayı giriniz.");
                scanner.nextLine();
            }
        }

        valid = false;

        while (!valid) {
            System.out.print("Ondalıklı sayı giriniz : ");
            try {
                inputDouble = scanner.nextDouble();
                valid = true;

            } catch (Exception e) {
                System.out.println("Lütfen Ondalıklı sayı giriniz. (örnek : 20,3)");
                scanner.nextLine();
            }
        }

        double convertedInt = inputInt;
        int convertedDouble = (int) inputDouble;

        System.out.println("Girilen tam sayı: " + inputInt + " → Ondalık hali: " + convertedInt);
        System.out.println("Girilen ondalık sayı: " + inputDouble + " → Tam sayı hali: " + convertedDouble);

        scanner.close();

## Örnek Çıktı

    Tam sayı giriniz : 5
    Ondalıklı sayı giriniz : 5,99
    Girilen tam sayı: 5 → Ondalık hali: 5.0
    Girilen ondalık sayı: 5.99 → Tam sayı hali: 5