
public class Komputer {
protected String Producent;
protected String Model;
protected String PlytaGlowna;
protected String Procesor;
protected String KartaGraficzna;
protected String DyskTwardy;
public Komputer(String producent, String model, String plytaGlowna, String procesor, String kartaGraficzna,
        String dyskTwardy) {
    Producent = producent;
    Model = model;
    PlytaGlowna = plytaGlowna;
    Procesor = procesor;
    KartaGraficzna = kartaGraficzna;
    DyskTwardy = dyskTwardy;
    
}
public void showInfo() {
    System.out.println("Producent: " + Producent);
    System.out.println("Model: " + Model);
    System.out.println("Plyta glowna: " + PlytaGlowna);
    System.out.println("Procesor: " + Procesor);
    System.out.println("Karta graficzna: " + KartaGraficzna);
    System.out.println("Dysk twardy: " + DyskTwardy);}

public Komputer(){
    Producent = "Dell";
    Model = "Inspiron 15";
    PlytaGlowna = "Intel";
    Procesor = "Intel Core i5";
    KartaGraficzna = "Nvidia";
    DyskTwardy = "SSD";
}}
// public Komputer(){
//     this("Dell", "Inspiron 15", "Intel", "Intel Core i5", "Nvidia", "SSD");
// }

