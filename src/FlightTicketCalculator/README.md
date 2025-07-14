Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

## İpucu
    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
    Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
    İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
    Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
    Toplam Tutar = (135-27)* 2 = 216 TL
## Seneryolar

    Seneryo 1

    Mesafeyi giriniz (km): 1500
    Yaşınızı giriniz : 20
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
    Toplam Tutar = 216 TL


    Senaryo 2

    Mesafeyi giriniz (km): -500
    Yaşınızı giriniz : 1
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
    Hatalı Veri Girdiniz !


    Seneryo 3

    Mesafeyi giriniz (km): 200
    Yaşınızı giriniz : 35
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
    Toplam Tutar = 20.0 TL

## Cevap:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz (km): ");
        int km = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk Tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int type = scanner.nextInt();

        if (km <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double perPrice = 0.10;
        double totalPrice = km * perPrice;

        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = 0.50;
        } else if (age <= 24) {
            ageDiscount = 0.10;
        } else if (age > 65) {
            ageDiscount = 0.30;
        }

        totalPrice -= totalPrice * ageDiscount;

        if (type == 2) {
            totalPrice -= totalPrice * 0.20;
            totalPrice *= 2;
        }

        System.out.println("Toplam Tutar = " + totalPrice + " TL");