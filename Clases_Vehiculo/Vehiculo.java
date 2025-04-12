package Clases_Vehiculo;

public abstract class Vehiculo {
    //Clase Vehiculo es abstracto para que sirva como base para diferentes tipos de vehiculos
    protected String marca; //Atributos de la clase Vehiculo
    protected String modelo; //modelo,marca,año
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) { //Constructor de la clase vehiculo
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    // Metodo abstracto para calcular el Costo de mantenimiento, esto debe ser implementado
    // por las clases hijas.
    public abstract double calcularCostoMantenimiento();

    //Métodos, getters y setters.

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
