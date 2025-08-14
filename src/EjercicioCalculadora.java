import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        double resultado= 0;
        boolean operacionValida=true;
    Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("========");
        System.out.println("Ingrese su primer número");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese su segundo número");
        double num2 = sc.nextDouble();
        System.out.println("Que quiere realizar");
        System.out.println("1.+ 2.- 3.* 4./");
        char opcion = sc.next().charAt(0);
        switch (opcion){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    resultado = num1 / num2;
                }else{
                    operacionValida= false;
                }
                break;
            default:
                operacionValida = false;
        }
        if (operacionValida){
            String tipoResultado = (resultado>0) ? "Positivo" : "Negativo";
            System.out.println("El resultado es: " +resultado + "(" + tipoResultado+")");
        }


    }
}
