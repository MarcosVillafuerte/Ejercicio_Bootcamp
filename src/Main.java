import detail.Pen;
import feature.Car;

import java.util.Scanner;

// This is the main class.
public class Main {

    // This is the main driver method.
    public static void main(String[] args) {
// This is the standard print statement
        System.out.println("Marcos");
        Car lamborguini = new Car("rojo", "Nexu","NN");
        lamborguini.stop();
        lamborguini.acelerar();

        Pen faberC = new Pen("FaberC", "Azul",15.20);
        faberC.write();
        faberC.changeInk();

        int num1 = 50;

        // CALCULADORA
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Que desea hacer 1. Suma, 2. Resta, 3. Multiplicación, 4. División");
        int simbo = scanner.nextInt();

        System.out.println("Ingrese el primer numero");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num3 = scanner.nextInt();
        int result;

        if (simbo==1){
            result=num2 + num3;
        }else if (simbo==2){
            result=num2 - num3;
        }else if (simbo==3){
            result=num2 * num3;
        }else{
            result=num2 / num3;
        }

        System.out.println("Su respuesta es: " +result);
        scanner.close(); // Close the scanner to release resources


    }
    private static int sumar(int a, int b) { // funcion
        // This is a simple method to add two numbers
        return a + b;
    }
}