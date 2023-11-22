package problema02;

import java.util.Scanner;

public class Problema02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var1, var2, var3, var4, var5, var6;
        System.out.println("Ingresa el primer lado");
        var1 = teclado.nextDouble();
        System.out.println("Ingresa el segundo lado");
        var2 = teclado.nextDouble();
        System.out.println("Ingresa el tercer lado");
        var3 = teclado.nextDouble();
        var4 = var1 + var2;
        var5 = var1 + var3;
        var6 = var2 + var3;
        if ((var4 < var3) || (var5 < var2) || (var6 < var1)) {
            System.out.println("Este no es un Triangulo");
        } else if ((var1 == var2) && (var2 == var3)) {
            System.out.println("Todos sus lados son iguales por lo tanto es un 'Triangulo Equilatero'");
        } else if ((var1 == var2) || (var2 == var3) || (var1 == var3)) {
            System.out.println("Tiene solo dos lados iguales por lo tanto es un 'Triangulo Isoseles'");
        } else if ((var1 != var2) && (var2 != var3) && (var1 != var3)) {
            System.out.println("Todos sus lados son diferentes por lo tanto es un 'Triangulo Escaleno'");
        }
    }

}
