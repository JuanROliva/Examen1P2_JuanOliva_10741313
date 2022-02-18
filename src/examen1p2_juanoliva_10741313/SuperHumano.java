package examen1p2_juanoliva_10741313;

import java.util.Random;

public class SuperHumano extends Persona{
    private String superPoder;

    public SuperHumano() {
        super();
    }

    public SuperHumano(String superPoder, String nombre, String poder, String debilidad, boolean tipoPersona, Escuadron escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.superPoder = superPoder;
    }
    
    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    @Override
    public String toString() {
        return "SuperHumano: " + super.toString();
    }

    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModifcar1 = aleatorio.nextInt(3)+1;
        switch (atributoModifcar1) {
            case 1 -> setFuerza((int)(getFuerza()*4));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*4));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*4));
        }
        int atributoModifcar2 = aleatorio.nextInt(3)+1;
        while (atributoModifcar1==atributoModifcar2) {
            atributoModifcar2 = aleatorio.nextInt(3)+1;
        }
        switch (atributoModifcar2) {
            case 1 -> setFuerza((int)(getFuerza()*0.5));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*0.5));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*0.5));
        }
    }
}
