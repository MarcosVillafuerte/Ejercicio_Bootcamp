import java.util.Scanner;

public class Practicar2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cantCambiada = 0;
        boolean exit = true;
        boolean validarN= false;
        double cantidadF= 0;

        double solesDolar = 0.28;
        double solesEuro = 0.24;
        double solesYen = 42.0;
        double solesRublo = 22.44;

        while (exit) {
            int opcion= 0;
            System.out.println("=== CONVERSOR DE MONEDAS ===");
            System.out.println("1. PEN a USD");
            System.out.println("2. PEN a EUR");
            System.out.println("3. PEN a YEN");
            System.out.println("4. PEN a RUB");
            System.out.println("5. Calculadora");
            System.out.println("6. Salir");
            while (!validarN){
                opcion = sc.nextInt();
                if ((opcion>=1)&&(opcion<=6)){
                    validarN=true;
                }else {
                    System.out.println("Ingrese una opcion disponible");
                }
            }
            System.out.println("Cantidad a cambiar?");
            cantCambiada = sc.nextDouble();
            switch (opcion){
                case 1:
                    cantidadF = cantCambiada * solesDolar;
                    break;
                case 2:
                    cantidadF = cantCambiada * solesEuro;
                    break;
                case 3:
                    cantidadF = cantCambiada * solesYen;
                    break;
                case 4:
                    cantidadF = cantCambiada * solesRublo;
                    break;
                case 5:
                    calculadora(sc);
                    break;
                case 6:
                    exit= false;
                    break;

            }
            System.out.println("Cambiaste S/ "+cantCambiada + " a " + cantidadF );

        }
    }

    public static void calculadora(Scanner sc){
        double resultado = 0;
        int operacion=0;
        boolean validarC= false;
        boolean s = true;
        System.out.println("Calculadora");
        System.out.println("Que operación desea hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. División");
        System.out.println("5. Salir");

        while (!validarC){
            operacion = sc.nextInt();
            if ((operacion>=1)&&(operacion<=5)){
                validarC=true;
            }else {
                System.out.println("Ingrese una opcion disponible");
            }
        }
        System.out.println("Ingrese el primer numero");
        double n1= sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double n2=sc.nextDouble();
        while (s){
            switch (operacion){
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    if (n2!=0){
                        resultado = n1 / n2;
                    }else{
                        System.out.println("No se puede dividir nada contra 0");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar la calculadora");
                    s=false;
                    break;
            }
        }
    }
}
