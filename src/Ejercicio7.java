import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar tres números (representan la
         * longitud de una línea) y compruebe si con estos números se puede formar un
         * triángulo.
         */

         var scanner = new Scanner(System.in);

         var numero1 = 0;
         var numero2 = 0;
         var numero3 = 0;

         System.out.println("Ingrese el número 1");
         numero1 = scanner.nextInt();
         System.out.println("Ingrese el número 2");
         numero2 = scanner.nextInt();
         System.out.println("Ingrese el número 3");
         numero3 = scanner.nextInt();

         if(numero1 + numero2 > numero3 && numero1 + numero3 > numero2 && numero2 + numero3 > numero1)
         {
            System.out.println("Si se puede formar un triángulo");
         }else{
            System.out.println("No se puede formar un triángulo");
         }

        
         scanner.close();
    }
}
