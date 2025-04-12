package Pares;

public class PruebaPar {
    public static void main(String[] args) {

        // Este crea un para que dice una palabra y un numero
        Par<String, Integer> par1 = new Par<>("Edad ", 28);
        System.out.println("Mi primer Par es: " + par1);

        // Crear un par que tiene un número double y un sí o no (Boolean)
        Par<Double, Boolean> par2 = new Par<>(99.99, true);
        System.out.println("Mi segundo Par es: " + par2);

        // Crear un par que tiene una letra y una palabra
        Par<Character, String> par3 = new Par<>('A', "Letra A ");
        System.out.println("Mi tercer Par es: " + par3);
    }
}
