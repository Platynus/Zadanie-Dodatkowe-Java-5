import java.util.Scanner;

public class Samochod {
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rok;
    private int przebieg;
    
    public Samochod(String marka, String model, String nadwozie, String kolor, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rok = rok;
        this.przebieg = przebieg;
    }
    public Samochod(){
        marka = "Nieznana";
        model = "Nieznany";
        nadwozie = "Nieznane";
        kolor = "Nieznany";
        rok = 0;
        przebieg = 0;
    }


    public static Samochod createSamochod(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Podaj marke");
    String marka = sc.nextLine();
    System.out.println("Podaj model");
    String model = sc.nextLine();
    System.out.println("Podaj nadwozie");
    String nadwozie = sc.nextLine();
    System.out.println("Podaj kolor");
    String kolor = sc.nextLine();
    System.out.println("Podaj rok");
    int rok = sc.nextInt();
    System.out.println("Podaj przebieg");
    int przebieg = sc.nextInt();
    sc.close();
    return new Samochod(marka, model, nadwozie, kolor, rok, przebieg);
    
}

public void showInfo(){
    System.out.println("Marka: " + marka);
    System.out.println("Model: " + model);
    System.out.println("Nadwozie: " + nadwozie);
    System.out.println("Kolor: " + kolor);
    System.out.println("Rok: " + rok);
    setPrzebieg(przebieg);
    System.out.println("Przebieg: " + przebieg);
}
    
public String getMarka() {
    return marka;
}

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public String getKolor() {
        return kolor;
    }
    
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
    public int getRok() {
        return rok;
    }
    
    public void setRok(int rok) {
        this.rok = rok;
    }
    public int getPrzebieg() {
        return przebieg;
    }
    
    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
        if(przebieg < 0) {
            System.out.println("Przebieg nie moze byc ujemny");
            this.przebieg = 0;
        }
    }
    
    
}
