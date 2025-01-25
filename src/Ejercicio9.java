import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la
         * cantidad de unidades que le compren. La siguiente tabla muestra la
         * información:
         * 
         * Unidades Precio por unidad
         * [1 - 50] $50.000
         * (50 - 100] $45.000
         * (100 - 150] $40.000
         * (150 - 200] $35.000
         * > 200 $25.000
         * 
         * Escriba un programa que dado un número de camisas retorne el precio por
         * unidad.
         */

         var scanner = new Scanner(System.in);
         var cantidad = 0;

         System.out.println("Ingrese el número de camisetas: ");
         cantidad = scanner.nextInt();

         if(cantidad >= 1 && cantidad <= 50)
         {
            System.out.println("El precio por unidad es de $50.000");
         }else if (cantidad > 50 && cantidad <= 100)
         {
            System.out.println("El precio por unidad es de $45.000");
         }else if(cantidad > 100 && cantidad <= 150)
         {
            System.out.println("El precio por unidad es de $40.000");
         }else if(cantidad > 150 && cantidad <= 200)
         {
            System.out.println("El precio por unidad es de $35.000");
         }else{
            System.out.println("El precio por unidad es de $25.000");
         }
         scanner.close();
    }
}
