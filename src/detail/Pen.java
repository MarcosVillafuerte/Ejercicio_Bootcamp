package detail;

public class Pen {
    String marca;
    String color;
    Double precio;

    public Pen() {
    }

    public Pen(String marca, String color, Double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public void write() {
        System.out.println("Escribir");
    }
    public void changeInk(){
        System.out.println("Cambier tinta");
    }
}
