package Cont;

import java.util.ArrayList;

public class Contenedor<T> {
    private ArrayList<T> elementos;


    public Contenedor() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    public int contar() {
        return elementos.size();
    }

    public boolean estaVacio() {
        return elementos.isEmpty();
    }
}

