import java.util.Scanner;

public class KomputerPrzenoscny extends Komputer {

    private double waga;
    private String bateria;
    private String bluetooth;
    public KomputerPrzenoscny(String producent, String model, String plytaGlowna, String procesor, String kartaGraficzna,
            String dyskTwardy, double waga, String bateria, String klawiatura, String bluetooth) {
        super(producent, model, plytaGlowna, procesor, kartaGraficzna, dyskTwardy);
        this.waga = validateWaga(waga);
        this.bateria = bateria;
        this.bluetooth = valueCheck(bluetooth);;
    }
    public static double validateWaga(double waga) {
        Scanner scan = new Scanner(System.in);
        while ((waga < 0.5 || waga > 2.5)) {
                System.out.println("Waga musi byc w przedziale 0.5 - 2.5");
                waga = scan.nextDouble();
                System.out.println("Waga: " + waga);
            }
            scan.close();
            return waga;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Waga: " + waga);
        System.out.println("Bateria: " + bateria);
        System.out.println("Bluetooth: " + bluetooth);
    }
    public static String valueCheck(String bluetooth) {
        Scanner scan = new Scanner(System.in);
            while (!(bluetooth.equals("t") || bluetooth.equals("n"))) {
                System.out.println("Bluetooth musi byc t lub n");
                bluetooth = scan.next();
                System.out.println("Bluetooth: " + bluetooth);

            }
            scan.close();
        return bluetooth;
        // Scanner scan = new Scanner(System.in);
        // String value = bluetooth;
        //     while (value != "t" || value != "n") {   
        //         System.out.println("Bluetooth musi byc t lub n");
        //         value = scan.next();
        //         System.out.println("Bluetooth: " + value);
        //     }
        //     scan.close();
        // return value; dlaczego to nie dziala?
    }
    
    public static KomputerPrzenoscny createKomputerPrzenoscny() {
        Scanner scanner = new Scanner(System.in);
            scanner.reset();
            System.out.println("Podaj producenta: ");
            String producent = scanner.nextLine();
            System.out.println("Podaj model: ");
            String model = scanner.nextLine();
            System.out.println("Podaj plyte glowna: ");
            String plytaGlowna = scanner.nextLine();
            System.out.println("Podaj procesor: ");
            String procesor = scanner.nextLine();
            System.out.println("Podaj karte graficzna: ");
            String kartaGraficzna = scanner.nextLine();
            System.out.println("Podaj dysk twardy: ");
            String dyskTwardy = scanner.nextLine();
            System.out.println("Podaj wage: ");
            double waga = validateWaga(scanner.nextDouble());
            scanner.close();
            scanner.reset();
            Scanner scan = new Scanner(System.in);//w tym miejscu wyrzuca blad, ze scanner jest juz zamkniety i utworzony jest nowy
            System.out.println("Podaj bateria: ");
            String bateria = scan.next();
            System.out.println("Podaj bluetooth: ");
            String bluetooth = valueCheck(scan.nextLine());
            scan.close();
            return new KomputerPrzenoscny(producent, model, plytaGlowna, procesor, kartaGraficzna, dyskTwardy, waga, bateria, bluetooth, bluetooth);
        }
    

}
