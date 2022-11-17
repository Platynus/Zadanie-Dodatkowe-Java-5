import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj numer zadania: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Zadanie 1");
                    KolorowyPunkt kolorowyPunkt = new KolorowyPunkt(1, 2, "red");
                    kolorowyPunkt.showInfo();
                    break;
                    case 2:
                    System.out.println("Zadanie 2");
                    Kierownik kierownik = new Kierownik("Jacek", "Tak", "9292929292", "20-12-2002", "21-9-2020", "10", "sprzedaz", 10, "glowny", 0);
                    Pracownik pracownik = kierownik.nowyPracownik();
                    kierownik.showInfo();
                    System.out.println();
                    pracownik.showInfo();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Zadanie 3");
                    KierownikSprzedazy kierownikSprzedazy = new KierownikSprzedazy("Jan", "Berbec", "50", "20-10-2019", "Marketing", 2000, "dodawanie", 0.2);
                    kierownikSprzedazy.showInfo();
                    Sprzedawca sprzedawca1 = new Sprzedawca("Jan", "Klusek", "30", "20-10-2019", "Marketing", 2000);
                    sprzedawca1.showInfo();
                    System.out.println();
                    Sprzedawca sprzedawca = kierownikSprzedazy.dodajPracownika();
                    sprzedawca.showInfo();
                    break;
                case 4:
                    System.out.println("Zadanie 4");
                    KomputerPrzenoscny foo = KomputerPrzenoscny.createKomputerPrzenoscny();
                    foo.showInfo();
                    Komputer komputer = new Komputer();
                    komputer.showInfo();
                    Komputer komputer1 = new Komputer("Lenovo", "Yoga", "MSI", "Radeon", "RTX 2060", "HDD");
                    komputer1.showInfo();
                    break;
                case 5:
                    System.out.println("Zadanie 5");
                    Samochod samochod = new Samochod("Audi", "A4", "B5", "Benzyna", 2000, -10);
                    samochod.showInfo();
                    Samochod samochod1 = new Samochod("Audi", "A4", "sedan", "czarny", 2015, 100000);
                    samochod1.showInfo();
                    Samochod samochod2 = Samochod.createSamochod();
                    samochod2.showInfo();
                    Samochod samochod3 = new Samochod();
                    samochod3.showInfo();
                    SamochodOsobowy samochodOsobowy = new SamochodOsobowy("BMW", "X5", "suw", "bialy", 2022, 0, 3, 3, 5);
                    samochodOsobowy.showInfo();
                    break;
                default:
                    System.out.println("Nie ma takiego zadania");
                    break;
            }
        }      


    }
}
