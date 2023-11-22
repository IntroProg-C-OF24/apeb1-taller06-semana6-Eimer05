package problema05;

import java.util.Scanner;

public class Problema05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una operacion | 1 = Sumar | 2 = Restar | 3 = Multiplicar | 4 = Dividir|");
        int operacion = teclado.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Sumar: ");
                break;
            case 2:
                System.out.println("Restar: ");
                break;
            case 3:
                System.out.println("Multiplicar: ");
                break;
            case 4:
                System.out.println("Dividir: ");
                break;
            default:
                System.out.println("Syntax Error");
        }

    }

}
