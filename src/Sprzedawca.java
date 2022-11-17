public class Sprzedawca {
    protected String imie,nazwisko,kodSprzedwcy,odKiedyZatrudniony,dzial;
    protected double wynagrodzenie;
    public Sprzedawca(String imie, String nazwisko, String kodSprzedwcy, String odKiedyZatrudniony, String dzial,
            double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kodSprzedwcy = kodSprzedwcy;
        this.odKiedyZatrudniony = odKiedyZatrudniony;
        this.dzial = dzial;
        this.wynagrodzenie = wynagrodzenie;
    }
    public void addEmployee() {
        System.out.println("Dodano nowego sprzedawce");
    }
    public void showInfo() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Kod sprzedawcy: " + kodSprzedwcy);
        System.out.println("Od kiedy zatrudniony: " + odKiedyZatrudniony);
        System.out.println("Dzial: " + dzial);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
    
}
