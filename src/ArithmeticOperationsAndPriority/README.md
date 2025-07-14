# Pratik - Aritmetik İşlemler ve İşlem Önceliği
### Soru:
Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın. İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

### Örnek:
Kullanıcıdan alınan sayılar 10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun. İşlemleri kullanıcı girmeyecek olup kodunuzda yazmış olmalısınız.

#### İpucu 1:
Kullanıcıdan veri almak için `Scanner` sınıfını kullanabilirsiniz.

#### İpucu 2:
Sonucu ekrana yazdırmak için `System.out.println()` metodunu kullanabilirsiniz.

---

### Cevap:

    Scanner scanner = new Scanner(System.in);

    System.out.println("İlk Sayınızı Giriniz :");
    int a = scanner.nextInt();

    System.out.println("İkinci Sayınızı Giriniz :");
    int b = scanner.nextInt();

    System.out.println("Üçüncü Sayınızı Giriniz :");
    int c = scanner.nextInt();

    int result = a + (b * c) - b;

    System.out.println("Sonuç :" + result);

    scanner.close();

### Çıktı:

    İlk Sayınızı Giriniz : 10
    İkinci Sayınızı Giriniz : 2
    Üçüncü Sayınızı Giriniz : 3
    Sonuç : 14 // 10 + 2 * 3 - 2