import javax.swing.*;
import java.util.Scanner;

public class Practicar {

    public static void main(String[] args) {
        boolean exit= true;
        Scanner sc = new Scanner(System.in);
        double saldoI= 1000;
        while (exit){
            System.out.println("Menu");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuanto desea depositar?");
                    double deposito = sc.nextDouble();
                    saldoI +=deposito;
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    double retiro = sc.nextDouble();
                    if (saldoI-retiro>=0){
                        saldoI-=retiro;
                        System.out.println("Le queda: "+saldoI);
                    }else {
                        System.out.println("No tiene el saldo suficiente");
                    }
                    break;
                case 3:
                    System.out.println("Su saldo es: " +saldoI);
                    break;
                case 4:
                    System.out.println("Gracias por su confianza");
                    exit=false;
                    break;
                default:
                    System.out.println("Ingrese una opcion dada");

            }
        }

    }
}
