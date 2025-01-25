import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número y determine si es
         * divisible por dos y siete.
         */

         var scanner = new Scanner(System.in);
         var numero = 0;

         System.out.println("Ingrese un nùmero");
         numero = scanner.nextInt();

         if(numero % 2 == 0 && numero % 7 == 0)
         {
            System.out.printf("El número %d SI es divisible por 2 y 7", numero);
         }else
         {
            System.out.printf("El nùmero %d NO es divisible por 2 y 7", numero);
         }
         scanner.close();
    }
}
