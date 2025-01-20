import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo, positivo o cero.
         */

         var scanner = new Scanner(System.in);

         var numero = 0;
         System.out.println("Ingrese un número: ");
         numero = scanner.nextInt();

         if(numero > 0){
            System.out.printf("El número %d es un número positivo", numero);
         }else if(numero < 0)
         {
            System.out.printf("El número %d es un número negativo", numero);
         }else
         {
            System.out.println("El número es cero");
         }
         scanner.close();
    }
}
