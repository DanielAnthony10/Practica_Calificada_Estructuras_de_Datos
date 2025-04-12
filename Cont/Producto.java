package Cont;

public class Producto {
    private String nombre;
    private float costo;
    private int cantidad;

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    public Producto(float costo){
        this.costo = costo;
    }

    public Producto(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(String nombre, float costo, int cantidad){
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public float getCosto(){
        return costo;
    }

    public int getCantidad(){
        return cantidad;
    }

    @Override
    public String toString() {
        return nombre + costo + cantidad;
    }
}
