package Diseño_Algoritmos;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMejor {

    // Versión recursiva
    public int fibonacciRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 0");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fibonacciMejor(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 0");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        // Verifica si ya fue calculado
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // Si no, calcula y guarda
        int resultado = fibonacciMejor(n - 1) + fibonacciMejor(n - 2);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        FibonacciMejor fib = new FibonacciMejor();

        int n = 10;
        System.out.println("Recursivo simple para n=" + n + ": " + fib.fibonacciRecursivo(n));
        System.out.println("Con memorización para n=" + n + ": " + fib.fibonacciMejor(n));
    }
}
