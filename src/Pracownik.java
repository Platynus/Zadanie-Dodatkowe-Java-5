public class Pracownik {
    protected String imie,nazwisko,nip,dataUrodzenia,dataZatrudnienia,pensja,dzial;

    public Pracownik(String imie, String nazwisko, String nip, String dataUrodzenia, String dataZatrudnienia,
            String pensja, String dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nip = nip;
        this.dataUrodzenia = dataUrodzenia;
        this.dataZatrudnienia = dataZatrudnienia;
        this.pensja = pensja;
        this.dzial = dzial;
    }
    // show info about employee
    public void showInfo() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("NIP: " + nip);
        System.out.println("Data urodzenia: " + dataUrodzenia);
        System.out.println("Data zatrudnienia: " + dataZatrudnienia);
        System.out.println("Pensja: " + pensja);
        System.out.println("Dzial: " + dzial);
    }


}
