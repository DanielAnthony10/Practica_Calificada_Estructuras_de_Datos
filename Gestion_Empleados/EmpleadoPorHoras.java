package Gestion_Empleados;
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre, 0); // salarioBase no se usa
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double Final(){
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public void mostrarEmpleado(){
        System.out.println("Empleado por Horas:");
        super.mostrarEmpleado();
    }
}
