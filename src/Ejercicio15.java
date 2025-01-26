import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
         * Escriba un programa en el que ingrese un número y le diga si es positivo o
         * negativo. Repita el proceso hasta que se ingrese el número cero.
         */
        var scanner = new Scanner(System.in);
        var numero = 1;

        while(numero != 0)
        {
            System.out.println("Ingrese un número");
            numero = scanner.nextInt();
            if(numero > 0)
            {
                System.out.println("El número es positivo");
            }else if(numero < 0){
                System.out.println("El número es negativo");
            }else
            {
                System.out.println("El número es cero, adiós!");
            }
        }
        scanner.close();
    }
}
