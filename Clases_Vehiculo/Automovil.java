package Clases_Vehiculo;

public class Automovil extends Vehiculo {
    private double kilometraje;
    private boolean tieneAireAcondicionado;

    public Automovil(String marca, String modelo, int anio, double kilometraje, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio);
        this.kilometraje = kilometraje;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double costo = kilometraje * 0.05;
        if (tieneAireAcondicionado) {
            costo += 100;
        }
        return costo;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    public void setTieneAireAcondicionado(boolean tieneAire) {
        this.tieneAireAcondicionado = tieneAire;
    }
}
