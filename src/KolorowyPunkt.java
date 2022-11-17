
public class KolorowyPunkt extends Punkt  {
    private String Color;


    public KolorowyPunkt(int x, int y, String color) {
        super(x, y);
        Color = color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
    public void showInfo() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Color: " + Color);
    }
    
    
}
