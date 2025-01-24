import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si es vocal
         * o consonante.
         */

         var scanner = new Scanner(System.in);
         var letra = "";
         var vocalOConsonante = "";

         System.out.println("Ingrese una letra");
         letra = scanner.nextLine();

        
        vocalOConsonante = switch(letra)
        {
            case "a", "e", "i", "o", "u" -> {
                yield "es vocal";
            }
            default -> {
                yield "es consonante";
            }
        };

        System.out.printf("La letra %s %s", letra, vocalOConsonante);
            
     
         
         scanner.close();
    }
}
