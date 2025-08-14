import java.util.Scanner;

public class CondicionalExamples {
    public static void main(String[] args) {
        System.out.println("Ejemplo condicionales");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota");
        int nota = sc.nextInt();

        if (nota >= 16) {
            System.out.println("Aprobado con excelencia");
        } else if (nota >= 13 ) {
            System.out.println("Estas muy bien");
        }
        else if (nota >= 11 ) {
            System.out.println("Estas aprobado");
        }
        else {
            System.out.println("Desaprobado");
        }

        System.out.println("==========");
        int edad = sc.nextInt();
        String cualedad = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";

        System.out.println("El es:" +cualedad);

        System.out.println("==========");
        System.out.println("Ingresar el dia de la semana");
        int dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No se comprobo el dia");
        }
        System.out.println("SALIO DEL PROGRAMA");
        sc.close();
    }
}
