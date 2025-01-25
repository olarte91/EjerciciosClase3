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
}
