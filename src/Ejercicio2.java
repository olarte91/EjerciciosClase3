import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que le permita ingresar tres números e imprima en la
         * consola el más grande de ellos.
         */
        var scanner = new Scanner(System.in);

         int [] numeros = {0,0,0};

         for(int i = 0 ; i < numeros.length; i++)
         {
            System.out.printf("Ingrese el número %d:\n", i +1);
            numeros[i] = scanner.nextInt();
         }

         for(int i = 0; i < numeros.length; i++)
         {
            //System.out.println(numeros[i]);
         }

         scanner.close();


    }
}
