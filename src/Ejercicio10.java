import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
         * Escriba una función en la que ingrese un número entero entre 1 y 12. Este
         * número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El
         * resultado debe ser el número de días del mes ingresado.
         * Ejemplo:
         * 
         * Input : 12
         * Output : 31
         * A continuación encuentras la cantidad de días que tienen cada mes.
         * 
         * Mes Días
         * 1, 3, 5, 7, 8, 10 y 12 - 31
         * 4, 6, 9, 11 - 30
         * 2 - 28
         */

         var scanner = new Scanner(System.in);
         var mes = 0;

         System.out.println("Ingrese el número del mes:");
         mes = scanner.nextInt();

         System.out.printf("El Mes tiene %d días", diasMes(mes));
         scanner.close();

    }
    static int diasMes (int mes)
    {
        var dias = 0;
       dias = switch(mes)
       {
        case 1,3,5,7,8,10,12->
        {
            yield 31;
        }
        case 4,6,9,11->
        {
            yield 30;
        }
        case 2->
        {
            yield 28;   
        }
        default -> 0;
       };

       return dias;
    }
}
