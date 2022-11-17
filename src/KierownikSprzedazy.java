import java.util.Scanner;

public class KierownikSprzedazy extends Sprzedawca {
    protected String uprawnienia;
    protected double dodatekFunkcyjny;

    public KierownikSprzedazy(String imie, String nazwisko, String kodSprzedwcy, String odKiedyZatrudniony,
            String dzial, double wynagrodzenie, String uprawnienia, double dodatekFunkcyjny) {
        super(imie, nazwisko, kodSprzedwcy, odKiedyZatrudniony, dzial, wynagrodzenie);
        this.uprawnienia = uprawnienia;
        this.dodatekFunkcyjny = dodatekFunkcyjny;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Uprawnienia: " + uprawnienia);
        System.out.println("Dodatek funkcyjny: " + dodatekFunkcyjny);
        System.out.println(obliczWynagrodzenie());
    }
    public Sprzedawca dodajPracownika() {
        try (Scanner scan = new Scanner(System.in)) {
            scan.reset();
            System.out.println("Podaj imie: ");
            String imie = scan.nextLine();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = scan.nextLine();
            System.out.println("Podaj kod sprzedawcy: ");
            String kodSprzedwcy = scan.nextLine();
            System.out.println("Podaj od kiedy zatrudniony: ");
            String odKiedyZatrudniony = scan.nextLine();
            System.out.println("Podaj dzial: ");
            String dzial = scan.nextLine();
            System.out.println("Podaj wynagrodzenie: ");
            double wynagrodzenie = scan.nextDouble();
            return new Sprzedawca(imie, nazwisko, kodSprzedwcy,odKiedyZatrudniony, dzial,wynagrodzenie);
        }
    }
public double obliczWynagrodzenie() {
    return wynagrodzenie + (wynagrodzenie * dodatekFunkcyjny);
    
}
}
