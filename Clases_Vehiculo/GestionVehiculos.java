package Clases_Vehiculo;

public class GestionVehiculos {
    public static void main(String[] args) {

        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 30000.5, true);
        Vehiculo moto = new Motocicleta("Yamaha", "MT-03", 2021, 321);
        System.out.println("------------- COSTO -------------");
        System.out.println("Costo de mantenimiento del automóvil: " + auto.calcularCostoMantenimiento());
        System.out.println("Costo de mantenimiento de la motocicleta: " + moto.calcularCostoMantenimiento());

        compararVehiculos(auto, moto);
    }

    public static void compararVehiculos(Vehiculo v1, Vehiculo v2) {
        double costo1 = v1.calcularCostoMantenimiento();
        double costo2 = v2.calcularCostoMantenimiento();


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
