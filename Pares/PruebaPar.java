package Pares;

public class PruebaPar {
    public static void main(String[] args) {
        // Par de String e Integer
        Par<String, Integer> par1 = new Par<>("Edad", 28);
        System.out.println("Par 1: " + par1);

        // Par de Double y Boolean
        Par<Double, Boolean> par2 = new Par<>(99.99, true);
        System.out.println("Par 2: " + par2);

        // Par de Character y String
        Par<Character, String> par3 = new Par<>('A', "Letra A");
        System.out.println("Par 3: " + par3);
    }
}
