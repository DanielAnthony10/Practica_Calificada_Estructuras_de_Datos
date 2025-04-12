package ComplejidadAlgoritmica;

public class MaxSubarrayKadane {
    int contador;

    public int sumMasGrande(int[] numeros){
        int sumaActual = numeros[0]; //Comienza en -2
        int sumaMaxima = numeros[0]; //Comienza en -2 igual

        for (int i = 1; i < numeros.length; i ++){
            contador++; //Contdor de Vuletas
            if (sumaActual + numeros[i] > numeros[i]){
                sumaActual = sumaActual + numeros[i]; //sigue la suma actual
            } else{
                sumaActual = numeros[i]; //Sino se empieza desde este número
            }
            //La mejor actual
            if (sumaActual > sumaMaxima){
                sumaMaxima = sumaActual; //Acá se guarda la suma más grande
            }
        }
        return sumaMaxima;
    }
    
    //Médoto Principal
    public static void main(String[] args) {

        MaxSubarrayKadane suma = new MaxSubarrayKadane();

        int[] numeros = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int resultado = suma.sumMasGrande(numeros); //Llamada a la Función
        System.out.println("Suma máxima del subarreglo: " + resultado);//Salida : 6
        System.out.println("Numero de vultas: " + suma.contador); //Salida: 8
    } //Complejidad del Algoritmo: Es de O(n).
}
