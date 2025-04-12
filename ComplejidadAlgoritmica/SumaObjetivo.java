package ComplejidadAlgoritmica;

import java.util.HashSet;

public class SumaObjetivo {

    public boolean existeSumaObjetivo(int[] numeros, int objetivo) {
        HashSet<Integer> vistos = new HashSet<>();
        for (int numero : numeros) {
            int complemento = objetivo - numero;
            if (vistos.contains(complemento)) {
                return true;
            }
            vistos.add(numero);
        }

        return false;
    }

    public static void main(String[] args) {
        SumaObjetivo suma = new SumaObjetivo();

        int[] ejemplo1 = {3, 5, 1, 7, 9};
        int objetivo1 = 10;
        System.out.println("Ejemplo 1: " + suma.existeSumaObjetivo(ejemplo1, objetivo1)); // true

        int[] ejemplo2 = {2, 4, 6};
        int objetivo2 = 11;
        System.out.println("Ejemplo 2: " + suma.existeSumaObjetivo(ejemplo2, objetivo2)); // false
    }
}
