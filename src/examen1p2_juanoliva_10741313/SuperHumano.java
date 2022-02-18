package examen1p2_juanoliva_10741313;

import java.util.Random;

public class SuperHumano extends Persona{
    private String superPoder;

    public SuperHumano() {
        super();
    }

    public SuperHumano(String superPoder, String nombre, String poder, String 
            debilidad, boolean tipoPersona, int fuerza, int agilidadFisica, 
            int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
        this.superPoder = superPoder;
    }
    
    public SuperHumano(Persona p, String superPoder) {
        super(p.getNombre(), p.getPoder(), p.getDebilidad(), p.isTipoPersona(), 
                p.getFuerza(), p.getAgilidadFisica(), p.getAgilidadMental());
        this.superPoder = superPoder;
    }
    
    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModificar1 = aleatorio.nextInt(3)+1;
        switch (atributoModificar1) {
            case 1 -> setFuerza((int)(getFuerza()*4));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*4));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*4));
        }
        int atributoModificar2 = aleatorio.nextInt(3)+1;
        while (atributoModificar1==atributoModificar2) {
            atributoModificar2 = aleatorio.nextInt(3)+1;
        }
        switch (atributoModificar2) {
            case 1 -> setFuerza((int)(getFuerza()*0.5));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*0.5));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*0.5));
        }
    }
}
