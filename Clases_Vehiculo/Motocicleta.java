package Clases_Vehiculo;
//Clase motocicleta que se extiende de la clase Vehiculo
//Tiene un atributo adicional (Cilindrada)
public class Motocicleta extends Vehiculo {
    private int cilindrada; //se pone en privado ya que es la caracteristica de la clase motocicleta

    public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio); //con esto se llama al constructor de la clase padre lo que definimos thi.marca = marca, etc...
        this.cilindrada = cilindrada;
    }

    //En este método qse calcula que el costo se fija multiplicando x 0.1
    //Para eso sirve este metodo
    @Override
    public double calcularCostoMantenimiento() {
        return cilindrada * 0.1;
    }
    //Gettes y Setters

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
