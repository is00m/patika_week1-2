Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

## Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

### Cevap

    Scanner scanner = new Scanner(System.in);
    double pear = 2.14;
    double apple = 3.67;
    double tomato = 1.11;
    double banana = 0.95;
    double aubergine = 5;

    System.out.println("Armut Kaç Kilo ?");
    int pearKg = scanner.nextInt();
    System.out.println("Elma Kaç Kilo ?");
    int appleKg = scanner.nextInt();
    System.out.println("Domates Kaç Kilo ?");
    int tomatoKg = scanner.nextInt();
    System.out.println("Muz Kaç Kilo ?");
    int bananaKg = scanner.nextInt();
    System.out.println("Patlıcan Kaç Kilo ?");
    int aubergineKg = scanner.nextInt();

    double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);

    System.out.println("Toplam Tutar : " + total + " TL");


Fiyat değişikliği yoksa geçerli.
## Örnek Çıktı;

    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL