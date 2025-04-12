package Diseño_Algoritmos;
public class MergeSort {

    // Método para ordenar el arreglo usando Merge Sort
    public void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return; // Si el arreglo está vacío o tiene un solo elemento, no hace falta ordenar
        }
        mergeSortRecursivo(array, 0, array.length - 1);
    }

    // Método recursivo para dividir el arreglo
    private void mergeSortRecursivo(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra el punto medio del arreglo
            int medio = (inicio + fin) / 2;
            // Ordena la primera mitad
            mergeSortRecursivo(array, inicio, medio);
            // Ordena la segunda mitad
            mergeSortRecursivo(array, medio + 1, fin);
            // Fusiona ambas mitades ordenadas
            fusionar(array, inicio, medio, fin);
        }
    }

    // Método para fusionar dos mitades ordenadas
    private void fusionar(int[] array, int inicio, int medio, int fin) {
        // Crea dos sub-arreglos temporales
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

        // Copiar los datos a los sub-arreglos temporales
        for (int i = 0; i < n1; i++) {
            izquierda[i] = array[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            derecha[j] = array[medio + 1 + j];
        }

        // Índices para recorrer los sub-arreglos
        int i = 0, j = 0, k = inicio;
        
        // Fusiona los dos sub-arreglos de manera ordenada
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                array[k] = izquierda[i];
                i++;
            } else {
                array[k] = derecha[j];
                j++;
            }
            k++;
        }

        // Si hay elementos restantes en el sub-arreglo izquierdo, copiamos
        while (i < n1) {
            array[k] = izquierda[i];
            i++;
            k++;
        }

        // Si hay elementos restantes en el sub-arreglo derecho, copiamos
        while (j < n2) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }

    // Método main para probar el algoritmo
    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();

        int[] arreglo1 = {5, 2, 9, 1, 5, 6};
        sorter.mergeSort(arreglo1);
        System.out.print("Arreglo 1 ordenado: ");
        for (int num : arreglo1) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] arreglo2 = {12, 11, 13, 5, 6, 7};
        sorter.mergeSort(arreglo2);
        System.out.print("Arreglo 2 ordenado: ");
        for (int num : arreglo2) {
            System.out.print(num + " ");
        }
    }
}
