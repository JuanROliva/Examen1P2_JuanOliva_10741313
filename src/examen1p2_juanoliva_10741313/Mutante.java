package examen1p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Random;

public class Mutante extends Persona{
    private ArrayList<String> factoresMutantes = new ArrayList<String>();

    public Mutante() {
        super();
    }

    public Mutante(String nombre, String poder, String debilidad, boolean tipoPersona, int fuerza, int agilidadFisica, int agilidadMental) throws MiExcepcion {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
    }
    
    public Mutante(Persona p) throws MiExcepcion {
        super(p.getNombre(), p.getPoder(), p.getDebilidad(), p.isTipoPersona(), p.getFuerza(), p.getAgilidadFisica(), p.getAgilidadMental());
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModifcar = aleatorio.nextInt(3)+1;
        int atributoModifcarEnemigo = aleatorio.nextInt(3)+1;
        
        switch (atributoModifcar) {
            case 1 -> setFuerza((int)(getFuerza()*2));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*2));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*2));
        }
        switch (atributoModifcarEnemigo) {
            case 1 -> enemigo.setFuerza((int)(enemigo.getFuerza()*0.5));
            case 2 -> enemigo.setAgilidadFisica((int)(enemigo.getAgilidadFisica()*0.5));
            case 3 -> enemigo.setAgilidadMental((int)(enemigo.getAgilidadMental()*0.5));
        }
    }
}
