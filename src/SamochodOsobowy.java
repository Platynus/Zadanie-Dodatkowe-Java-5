public class SamochodOsobowy extends Samochod {
    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;
    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok, int przebieg, int waga, int pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rok, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }
    public double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        this.waga = waga;
        if(waga > 4.5) {
            System.out.println("Za duza waga");
            this.waga = 4.5;
        }else if(waga < 1.5) {
            System.out.println("Za mala waga");
            this.waga = 1.5;}
        
    }
    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
        if(pojemnoscSilnika > 3) {
            System.out.println("Za duza pojemnosc silnika");
            this.pojemnoscSilnika = 3;}
        else if(pojemnoscSilnika < 0.8) {
            System.out.println("Za mala pojemnosc silnika");
            this.pojemnoscSilnika = 0.8;}}
    
    public int getIloscOsob() {
        return iloscOsob;
    }
    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }
    public void showInfo() {
        super.showInfo();
        setWaga(waga);
        setPojemnoscSilnika(iloscOsob);
        System.out.println("Waga: " + waga);
        System.out.println("Pojemnosc silnika: " + pojemnoscSilnika);
        System.out.println("Ilosc osob: " + iloscOsob);
    }
    
}
