Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

### Formül
    Kilo (kg) / Boy(m) * Boy(m)

### Cevap
    Scanner scanner = new Scanner(System.in);

    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
    double m = scanner.nextDouble();

    System.out.println("Lütfen kilonuzu giriniz : ");
    int kg = scanner.nextInt();

    double massIndex = kg / (m * m);

    System.out.println("Vücut Kitle İndeksiniz : " + massIndex);
    scanner.close();