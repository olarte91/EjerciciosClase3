import java.util.Scanner;;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número mientras estos sean
         * negativos. Detener cuando el número ingresado sea positivo y de cómo
         * resultado la cantidad de números negativos ingresados.
         */
        var scanner = new Scanner(System.in);
        var numero = -1;
        var acumulacion = "";

        while(numero < 0)
        {
            System.out.println("Ingrese un número negativo");
            numero = scanner.nextInt();

            if(numero < 0)
            {
                acumulacion += numero + ", ";
            }
        }
        System.out.println("Lista de números:");
        System.out.println(acumulacion);
        scanner.close();

    }
}
