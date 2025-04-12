package ComplejidadAlgoritmica;

import java.util.HashSet;

public class SumaObjetivo {

    public boolean sumaObjetivo(int[] numeros, int objetivo){
        HashSet<Integer> yaVistos = new HashSet<>();
        for (int numero : numeros){
            int falta = objetivo - numero;
            if (yaVistos.contains(falta)){
                return true; //Aca se muestra lo que suman
            }
            yaVistos.add(numero); //Con esto se guarda

        }
        return false; //Sino deja de buscar y no se encuentra ninguno más
    }

    public static void main(String[] args) {
        SumaObjetivo juego = new SumaObjetivo();

        int[]  numeros1 = {3, 5, 1, 7, 9};
        int objetivo1 = 10;
        System.out.println("¿Dos números suman " + objetivo1 + "? " + juego.sumaObjetivo(numeros1, objetivo1));; // Salida: Verdadero

        int[] numeros2 = {2, 4, 6};
        int objetivo2 = 11;
        System.out.println("¿Dos números suman " + objetivo2 + "? " + juego.sumaObjetivo(numeros2, objetivo2)); // Salida: Falso
    } //La complejidad del Algoritmo: Es de O(n)
}
