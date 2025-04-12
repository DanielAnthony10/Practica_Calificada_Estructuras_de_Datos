package Cont;

public class PruebaContenedor {
    public static void main(String[] args) {
        // Contenedor de Strings
        Contenedor<String> contenedorStrings = new Contenedor<>();
        contenedorStrings.agregar("Daniel");
        contenedorStrings.agregar("Mechan");

        System.out.println("Contenedor de Strings:");
        for (int i = 0; i < contenedorStrings.contar(); i++) {
            System.out.println("- " + contenedorStrings.obtener(i));
        }

        // Contenedor de Productos
        Contenedor<Producto> contenedorProductos = new Contenedor<>();
        contenedorProductos.agregar(new Producto("Lapicero"));
        contenedorProductos.agregar(new Producto("Cuaderno"));

        System.out.println("\nContenedor de Productos:");
        for (int i = 0; i < contenedorProductos.contar(); i++) {
            System.out.println("- " + contenedorProductos.obtener(i));
        }

        // Verificación de si están vacíos
        System.out.println("\n¿Contenedor de Strings vacío? " + contenedorStrings.estaVacio());
        System.out.println("¿Contenedor de Productos vacío? " + contenedorProductos.estaVacio());
    }
}
