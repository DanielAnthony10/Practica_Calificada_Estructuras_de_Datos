package Gestion_Empleados;

public class Gestion_De_Empleados{
    public static void main (String [] args){
        Empleado empleado_1 = new Empleado_Tiempo_Completo("Daniel Mechan", 3000, 500);
        Empleado empleado_2 = new EmpleadoPorHoras("Rodrigo Erick", 10, 50);
        System.out.println("----------------- EMPLEADOS ------------------");
        empleado_1.mostrarEmpleado();
        System.out.println();
        empleado_2.mostrarEmpleado();
    }
}