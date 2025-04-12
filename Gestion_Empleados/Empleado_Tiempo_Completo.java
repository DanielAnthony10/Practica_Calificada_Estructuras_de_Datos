package Gestion_Empleados;

public class Empleado_Tiempo_Completo extends Empleado {
    private double bonoExtra;

    public Empleado_Tiempo_Completo(String nombre, double salarioBase, double bonoExtra){
        super(nombre,salarioBase);
        this.bonoExtra = bonoExtra;
    }
    @Override
    public double Final() {
        return salarioBase + bonoExtra;
    }

    @Override
    public void mostrarEmpleado() {
        System.out.println("Empleado a Tiempo Completo: ");
        super.mostrarEmpleado();
    }
    
}
