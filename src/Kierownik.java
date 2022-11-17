import java.util.Scanner;

public class Kierownik extends Pracownik{
    private int iloscPodwladnych;
    private String typKierownicta;
    private double dodatekFunkcyjny;
    public Kierownik(String imie, String nazwisko, String nip, String dataUrodzenia, String dataZatrudnienia,
            String pensja, String dzial, int iloscPodwladnych, String typKierownicta, double dodatekFunkcyjny) {
        super(imie, nazwisko, nip, dataUrodzenia, dataZatrudnienia, pensja, dzial);
        this.iloscPodwladnych = iloscPodwladnych;
        this.typKierownicta = typKierownicta;
        this.dodatekFunkcyjny = dodatekFunkcyjny;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Ilosc podwladnych: " + iloscPodwladnych);
        System.out.println("Typ kierownictwa: " + typKierownicta);
        System.out.println("Dodatek funkcyjny: " + dodatekFunkcyjny +"%");
    }
    public void setIloscPodwladnych(int iloscPodwladnych) {
        this.iloscPodwladnych = iloscPodwladnych;
    }
    public Pracownik nowyPracownik() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj imie: ");
            String imie = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = scanner.nextLine();
            System.out.println("Podaj NIP: ");
            String nip = scanner.nextLine();
            System.out.println("Podaj date urodzenia: ");
            String dataUrodzenia = scanner.nextLine();
            System.out.println("Podaj date zatrudnienia: ");
            String dataZatrudnienia = scanner.nextLine();
            System.out.println("Podaj pensje: ");
            String pensja = scanner.nextLine();
            System.out.println("Podaj dzial: ");
            String dzial = scanner.nextLine();
            iloscPodwladnych +=1;
            scanner.reset();
            scanner.close();
            return new Pracownik(imie, nazwisko, nip, dataUrodzenia, dataZatrudnienia, pensja, dzial);
        }
    }
    public void usunPracownika() {
        this.iloscPodwladnych = iloscPodwladnych-=1;
    }
    
    
}
