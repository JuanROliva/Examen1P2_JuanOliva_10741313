package examen1p2_juanoliva_10741313;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private ArrayList<Escuadron> listaEscuadrones = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getListaEscuadrones() {
        return listaEscuadrones;
    }

    public void setListaEscuadrones(ArrayList<Escuadron> listaEscuadrones) {
        this.listaEscuadrones = listaEscuadrones;
    }

    @Override
    public String toString() {
        String conjuntoEscuadrones = "";
        for (Escuadron e : listaEscuadrones) {
            conjuntoEscuadrones = e.getNombre() + "\n";
        }
        return "Universo: " + nombre + "\nLista de Escuadrones:\n" + conjuntoEscuadrones;
    }
}
