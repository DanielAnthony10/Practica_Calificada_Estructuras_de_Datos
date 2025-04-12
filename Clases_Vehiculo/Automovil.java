package Clases_Vehiculo;
//Clase Automovil que se extiende de la clase Vehiculo como la anterior
public class Automovil extends Vehiculo {
    private double kilometraje; //los privates de la propia clase (Kilometraje y AireAcondicionado)
    private boolean tieneAireAcondicionado;
//Constructor de la clase Automovil
    public Automovil(String marca, String modelo, int anio, double kilometraje, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio); //Llama al contructor de la clase padre para su heredación
        this.kilometraje = kilometraje; //Define sus atributos propios de la clase
        this.tieneAireAcondicionado = tieneAireAcondicionado; //Define este atributo
    }

    // Se calcula en base al kilometraje y se suma un extra si tiene aire acondicionado.
    @Override
    public double calcularCostoMantenimiento() {
        double costo = kilometraje * 0.05;
        if (tieneAireAcondicionado) {
            costo += 100;
        }
        return costo;
    }
    //Gettes y Setters de la Clase Automovil

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
