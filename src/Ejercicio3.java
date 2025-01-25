import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número e identificar si es par o
         * impar.
         */

         var scanner = new Scanner(System.in);
         var numero = 0;

         System.out.println("Ingrese un número: ");
         numero = scanner.nextInt();
         if(numero % 2 == 0)
         {
            System.out.printf("El número %d es par", numero);
         }else
         {
            System.out.printf("El número %d es impar", numero);
         }
         scanner.close();
    }
}
