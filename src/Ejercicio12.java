import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
         * En un día soleado y caluroso Sebastian y Adriana salen en busca de una
         * sandia. Se dirigen a la tienda más cercana y compran la más grande y jugosa.
         * En casa se disponen a dividir y a comer la fruta pero se les presenta un gran
         * problema y es que Adriana y Sebastian son amantes de los números pares. De
         * manera que quieren dividir la sandía en dos partes no necesariamente iguales
         * pero ambas deben ser pares.
         * Escriba una función en el que pueda ingresar el peso de la sandía en
         * kilogramos y la respuesta sea:
         * 
         * SI en caso de que se pueda dividir este peso en números pares
         * NO de lo contrario.
         * Por ejemplo:
         * 
         * Input : 12
         * Output : SI
         * Como el peso de la sandía es de 12 kilogramos. Se puede dividir como 10 y 2
         * (recuerde que las partes no necesariamente deben ser iguales) o 6 y 6, o 8 y
         * 4 etc.
         */
        var scanner = new Scanner(System.in);
        var peso = 0;

        System.out.println("Ingrese el valor del peso en kilogramos");
        peso = scanner.nextInt();

        if(peso % 2 == 0)
        {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        
        scanner.close();
    }
}
