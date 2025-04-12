package Clases_Vehiculo;

public class GestionVehiculos {
    //Clase principal para gestionar vehiculos
    public static void main(String[] args) {

        // Se crean instancias de Automovil y Motocicleta usando polimorfismo
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 30000.5, true);
        Vehiculo moto = new Motocicleta("Yamaha", "MT-03", 2021, 321);

        // Muestra los costos de mantenimiento individuales
        System.out.println("------------- COSTO -------------");
        System.out.println("Costo de mantenimiento del automóvil: " + auto.calcularCostoMantenimiento());
        System.out.println("Costo de mantenimiento de la motocicleta: " + moto.calcularCostoMantenimiento());
        
        // Llama al método para comparar los costos
        compararVehiculos(auto, moto);
    }

    //Método que compara el costo de mantenimiento de dos vehículos.
    public static void compararVehiculos(Vehiculo v1, Vehiculo v2) {
        double costo1 = v1.calcularCostoMantenimiento();
        double costo2 = v2.calcularCostoMantenimiento();

        //Aca se muestra como funciona la clase abstracta ya que el costo del mantenimiento en los vehiculos son diferentes en cada uno
        //Esto es polimorfismo y podemos usarlo para las clases hijas de acuerdo a como lo implementemos, esto sería la estructura
        // de la clase Abstracta.

        System.out.println("\nComparación de costos de mantenimiento:");
        if (costo1 > costo2) {
            System.out.println(v1.getMarca() + " " + v1.getModelo() + " tiene mayor costo de mantenimiento.");
        } else if (costo2 > costo1) {
            System.out.println(v2.getMarca() + " " + v2.getModelo() + " tiene mayor costo de mantenimiento.");
        } else {
            System.out.println("Ambos vehículos tienen el mismo costo de mantenimiento.");
        }
    }
}
