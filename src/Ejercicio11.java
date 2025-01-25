import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
         * Escriba una función en la que pueda ingresar tres números enteros y
         * diferentes. Imprima estos valores en orden ascendente.
         * Por ejemplo:
         * 
         * Input : 3 , 100 , 1
         * Output : 13100
         * Tenga en cuenta que la respuesta es un texto. Los números los puede
         * concatenar.
         */

         var scanner = new Scanner(System.in);
         var numero1 = 0;
         var numero2 = 0;
         var numero3 = 0;

         System.out.println("Ingrese el primer número");
         numero1 = scanner.nextInt();
         System.out.println("Ingrese el segundo número");
         numero2 = scanner.nextInt();
         System.out.println("Ingrese el tercer número");
         numero3 = scanner.nextInt();

         System.out.println(ascendente(numero1, numero2, numero3));
         scanner.close();

    }
    static String ascendente(int num1, int num2, int num3)
    {
        String numerosOrdenados = "";

        if(num1 < num2 && num1 < num3)
        {
            numerosOrdenados += num1;
            if(num2 < num3)
            {
                numerosOrdenados += num2;
                numerosOrdenados += num3;
            }else{
                numerosOrdenados += num3;
                numerosOrdenados += num2;
            }
        }else if(num2 < num1 && num2 < num3)
        {
            numerosOrdenados += num2;
            if(num1 < num3)
            {
                numerosOrdenados += num1;
                numerosOrdenados += num3;
            }else{
                numerosOrdenados += num3;
                numerosOrdenados += num1;
            }
        }else
        {
            numerosOrdenados += num3;
            if(num1 < num2)
            {
                numerosOrdenados += num1;
                numerosOrdenados += num2;
            }else{
                numerosOrdenados += num2;
                numerosOrdenados += num1;
            }
        }

        return numerosOrdenados;
    }
}
