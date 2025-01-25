<<<<<<< HEAD
public class Ejercicio3 {
public static void main(String[] args) {
    /*
     * Almacenar la edad de 8 personas en un arreglo y sumarlas y mostrar resultado
     * por consola
     * posterior a esto , modificar la edad de la posición 3 y volver a sumar y
     * mostrar el resultado por consola
     */

     int[] edades = {12, 15, 33, 40, 50, 25, 43, 22};

     int suma = 0;

     for (int i = 0; i < edades.length; i++)
     {
        suma += edades[i];
     }

     System.out.println(suma);

     edades[2] = 60;
     int suma1 = 0;

     for (int i = 0; i < edades.length; i++)
     {
        suma1 += edades[i];
     }

     System.out.println(suma1);


}
=======
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
>>>>>>> 556cfd14ee9a9b61416f0c6ebe83f82d22fc2ca9
}
