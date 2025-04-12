package Cont;

public class Producto {
    private String nombre;
    private double costo;
    private int cantidad;



    public Producto(String nombre, double costo, int cantidad){
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    public Producto(String nombre) {
        this.nombre = nombre;
    }
    public Producto(double costo){
        this.costo = costo;
    }

    public Producto(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto(){
        return costo;
    }

    public int getCantidad(){
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " "+ "Costo: " + costo + " " + "Cantidad: " + cantidad;
    }
}
