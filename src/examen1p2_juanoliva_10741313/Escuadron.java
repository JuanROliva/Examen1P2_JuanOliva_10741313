package examen1p2_juanoliva_10741313;

import java.util.ArrayList;

class Escuadron {
    private String nombre;
    private String localidadBase;
    private Persona lider;
    private boolean tipoEscuadron; //True: Heroe False: Villano
    private ArrayList<Persona> miembrosEscuadron = new ArrayList<Persona>();

    public Escuadron() {
    }

    public Escuadron(String nombre, String localidadBase, Persona lider, boolean tipoEscuadron) {
        this.nombre = nombre;
        this.localidadBase = localidadBase;
        this.lider = lider;
        this.tipoEscuadron = tipoEscuadron;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidadBase() {
        return localidadBase;
    }

    public void setLocalidadBase(String localidadBase) {
        this.localidadBase = localidadBase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isTipoEscuadron() {
        return tipoEscuadron;
    }

    public void setTipoEscuadron(boolean tipoEscuadron) {
        this.tipoEscuadron = tipoEscuadron;
    }

    public ArrayList<Persona> getMiembrosEscuadron() {
        return miembrosEscuadron;
    }

    public void setMiembrosEscuadron(ArrayList<Persona> miembrosEscuadron) {
        this.miembrosEscuadron = miembrosEscuadron;
    }

    @Override
    public String toString() {
        return nombre + localidadBase;
    }
}
