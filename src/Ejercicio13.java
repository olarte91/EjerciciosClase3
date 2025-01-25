import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * Tres hermanos acuerdan reunirse. Los hermanos son identificados por los
         * siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
         * Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los
         * números de los hermanos que llegan a tiempo, determine el número del hermano
         * que llegará tarde.
         * Por ejemplo:
         * 
         * Input : 1 2
         * Output : 3
         * El tercer hermano es el el que llegara a la reunión tarde.
         */

         var scanner = new Scanner(System.in);
         var hermano1 = 0;
         var hermano2 = 0;
         var hermano3 = 0;

         System.out.println("Ingrese el número del primer hermano: ");
         hermano1 = scanner.nextInt();
         System.out.println("Ingrese el número del segundo hermano: ");
         hermano2 = scanner.nextInt();

         hermano3 = 6 - (hermano1 + hermano2);

         System.out.printf("El hermano que va a llegar tarde es el %d", hermano3);
         
         scanner.close();

    }
}
