package examen1p2_juanoliva_10741313;

import java.util.Random;

public class Normal extends Persona{

    public Normal() {
        super();
    }

    public Normal(String nombre, String poder, String debilidad, boolean tipoPersona, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
    }
    
    public Normal(Persona p) {
        super(p.getNombre(), p.getPoder(), p.getDebilidad(), p.isTipoPersona(), p.getFuerza(), p.getAgilidadFisica(), p.getAgilidadMental());
    }
    
    
    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModifcar = aleatorio.nextInt(3)+1;
        switch (atributoModifcar) {
            case 1 -> setFuerza((int)(getFuerza()*0.5));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*0.5));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*0.5));
        }
    }
}
