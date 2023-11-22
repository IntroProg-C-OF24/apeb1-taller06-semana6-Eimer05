package problema01;

import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double producto1,cantidadProducto1, subtotalProducto1,producto2,cantidadProducto2,subtotalProducto2, subtotal, total, descuento, costoEnvio, IVA, subtotalIVA;
        System.out.println("Costo del primer producto");
        producto1 = teclado.nextDouble();
        System.out.println("Cantidad de unidades del primer producto");
        cantidadProducto1 = teclado.nextDouble();
        System.out.println("Costo del segundo producto");
        producto2 = teclado.nextDouble();
        System.out.println("Cantidad de unidades del segundo producto");
        cantidadProducto2 = teclado.nextDouble();
        System.out.println("Costo del envio");
        costoEnvio = teclado.nextDouble();
        subtotalProducto1 = producto1 * cantidadProducto1;
        subtotalProducto2 = producto2 * cantidadProducto2;
        total = (producto1 * cantidadProducto1) + (producto2 * cantidadProducto2);
        subtotal = (producto1 * cantidadProducto1) + (producto2 * cantidadProducto2);
        if (total <= 1000) {
            IVA = total * 12 / 100;
            subtotalIVA = subtotal + IVA;
            descuento = subtotalIVA * 0.05;
            total = total - descuento + IVA + costoEnvio;
            System.out.println(" Subtotal del primer producto: " + subtotalProducto1);
            System.out.println(" Subtotal del segundo producto: " + subtotalProducto2);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA: " + IVA);
            System.out.println("Subtotal incluido IVA: " + subtotalIVA);
            System.out.println("Descuento: " + descuento);
            System.out.println("Costo del envio: " + costoEnvio);
            System.out.println("TOTAl: " + total);
        } else {
            if (total <= 5000) {
                IVA = total * 12 / 100;
                subtotalIVA = subtotal + IVA;
                descuento = subtotalIVA * 0.2;
                total = total - descuento + IVA + costoEnvio;
                System.out.println(" Subtotal del primer producto: " + subtotalProducto1);
                System.out.println(" Subtotal del segundo producto: " + subtotalProducto2);
                System.out.println("Subtotal: " + subtotal);
                System.out.println("IVA: " + IVA);
                System.out.println("Subtotal incluido IVA: " + subtotalIVA);
                System.out.println("Descuento: " + descuento);
                System.out.println("Costo del envio: " + costoEnvio);
                System.out.println("TOTAl: " + total);
            } else {
                IVA = total * 12 / 100;
                subtotalIVA = subtotal + IVA;
                descuento = subtotalIVA * 20 / 100;
                total = total - descuento + IVA;
                System.out.println(" Subtotal del primer producto:: " + subtotalProducto1);
                System.out.println(" Subtotal del segundo producto:: " + subtotalProducto2);
                System.out.println("Subtotal: " + subtotal);
                System.out.println("IVA: " + IVA);
                System.out.println("Subtotal incluido IVA: " + subtotalIVA);
                System.out.println("Descuento: " + descuento);
                System.out.println("El envio no tiene costo");
                System.out.println("TOTAl: " + total);
            }
        }
    }

}
