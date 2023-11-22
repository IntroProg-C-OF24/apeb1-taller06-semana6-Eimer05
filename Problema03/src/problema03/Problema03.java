package problema03;

import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int paquete1, paquete2, paquete3, region;
        double pesoPaquete;
        System.out.println("Ingresa los kilogramos del paquete ");
        pesoPaquete = teclado.nextDouble();
        System.out.println("Si tu region es local entonces ingrese el numero 1");
        System.out.println("Si tu region es nacional entonces ingrese el numero 2");
        System.out.println("Si tu region es otra entonces ingrese el numero 3");
        region = teclado.nextInt();
        paquete1 = 5;
        paquete2 = 10;
        paquete3 = 15;
        switch (region) {
            case 1:
                System.out.println("Local");
                break;
            case 2:
                System.out.println("Nacional");
                break;
            case 3:
                System.out.println("Otras");
                break;
        }
        if (pesoPaquete < 5 && region == 1) {
            System.out.println("El costo del envio es: $" + paquete1);
        } else {
            if (pesoPaquete >= 5 && pesoPaquete < 10 && region == 2) {
                System.out.println("El costo del envio es: $" + paquete2);
            } else {
                System.out.println("El costo del envio es: $" + paquete3);
            }
        }
    }

}
