package Pares;
//Esta clase guarda dos cosas que pueden ser diferentes.
public class Par<A, B> {
    private A primero; //Mi primer objeto
    private B segundo; //Mi segundo objeto

    //Constructor, acá se crea el par
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    //Get del primer objeto
    public A getPrimero() {
        return primero;
    }

    //Set del primer objeto
    public void setPrimero(A primero) {
        this.primero = primero;
    }

    //Get del segundo objeto
    public B getSegundo() {
        return segundo;
    }
    //Set del segunto objeto
    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }

    //Muestra:
    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}
