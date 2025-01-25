import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si la letra
         * es mayúscula o minúscula.
         */
        var scanner = new Scanner(System.in);

        var letra = "";
        System.out.println("Ingrese una letra");
        letra = scanner.nextLine();

        if(letra == letra.toUpperCase())
        {
            System.out.printf("la letra %s es mayúscula", letra);
        }else
        {
            System.out.printf("La letra %s es minúscula", letra);
        }
        
        scanner.close();
    }
}
