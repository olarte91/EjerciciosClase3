import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
         * Realice un programa en el que ingrese un número y muestre el cubo. Repita el
         * proceso hasta que se introduzca un valor negativo.
         */

         var scanner = new Scanner(System.in);
         long numero = 1L;

         while(numero > 0)
         {
            System.out.println("Ingrese un número");
            numero = scanner.nextInt();
            if(numero > 0){

                numero = numero * numero * numero;
                System.out.printf("El cubo del número es: %d\n", numero);
            }else{
                System.out.println("Número negativo, adiós!");
            }

            
         }
         scanner.close();
    }
}
