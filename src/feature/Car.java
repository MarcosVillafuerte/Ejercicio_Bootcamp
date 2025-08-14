package feature;

public class Car {
    //Atributos
    String color;
    String marca;
    String modelo;

    public Car() {
    }

    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void acelerar() { // no regesa
        System.out.println("Acelerando");
    }

    public int calcularKilometraje () {
        return 4;
    }

    public void stop() { // no regesa
        System.out.println("Stop");
    }
}
