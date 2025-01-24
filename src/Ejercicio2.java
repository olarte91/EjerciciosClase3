import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que le permita ingresar tres números e imprima en la
         * consola el más grande de ellos.
         */
        var scanner = new Scanner(System.in);

         int [] numeros = {0,0,0};
         var numeroGrande = 0;

         for(int i = 0 ; i < numeros.length; i++)
         {
            System.out.printf("Ingrese el número %d:\n", i +1);
            numeros[i] = scanner.nextInt();
         }


         for(int i = 0; i < numeros.length - 1; i++)
         {
            if (numeros[i] > numeros[i + 1] && numeros[i] > numeroGrande)
            {
               numeroGrande = numeros[i];
            }else if (numeros[i + 1] > numeros [i] && numeros[i + 1] > numeroGrande)
            {
               numeroGrande = numeros[i + 1];
            }
         }

         System.out.printf("El número más grande es: %d", numeroGrande);

         scanner.close();


    }
}
