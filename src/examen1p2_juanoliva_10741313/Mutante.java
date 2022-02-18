package examen1p2_juanoliva_10741313;

import java.util.ArrayList;

public class Mutante extends Persona{
    private ArrayList<String> factoresMutantes = new ArrayList<String>();

    public Mutante() {
        super();
    }

    public Mutante(String nombre, String poder, String debilidad, boolean tipoPersona, Escuadron escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, escuadron, fuerza, agilidadFisica, agilidadMental);
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public String toString() {
        return "Mutante{" + "factoresMutantes=" + factoresMutantes + '}';
    }
    
    
    
    
    
    
    
    
    
}
