package Gestion_Empleados;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public abstract double Final();

    public void mostrarEmpleado(){
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Salario Final: " + Final());
    }

}
