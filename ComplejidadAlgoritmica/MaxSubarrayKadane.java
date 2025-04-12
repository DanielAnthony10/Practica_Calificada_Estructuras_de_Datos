package ComplejidadAlgoritmica;

public class MaxSubarrayKadane {
    
    public int maxSubarraySum(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no debe estar vacío");
        }

        int maxActual = numeros[0];  // Máxima suma hasta el momento
        int maxGlobal = numeros[0];  // Máxima suma encontrada

        for (int i = 1; i < numeros.length; i++) {
            // Elegimos entre comenzar de nuevo o extender el subarreglo actual
            maxActual = Math.max(numeros[i], maxActual + numeros[i]);
            maxGlobal = Math.max(maxGlobal, maxActual);
        }

        return maxGlobal;
    }

    // Método de prueba
    public static void main(String[] args) {
        MaxSubarrayKadane solucion = new MaxSubarrayKadane();

        int[] ejemplo = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int resultado = solucion.maxSubarraySum(ejemplo);
        System.out.println("Suma máxima del subarreglo: " + resultado); // Debe imprimir 6
    }
}
