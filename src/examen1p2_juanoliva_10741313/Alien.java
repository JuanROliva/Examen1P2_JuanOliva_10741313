package examen1p2_juanoliva_10741313;

import java.util.Random;

public class Alien extends Extraterrestre{

    private String planetaProcedencia;

    public Alien() {
        super();
    }


    public Alien(String planetaProcedencia, String nombre, String poder, String debilidad, boolean tipoPersona, int fuerza, int agilidadFisica, int agilidadMental) throws MiExcepcion {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
        this.planetaProcedencia = planetaProcedencia;
    }

    public Alien(Persona p) throws MiExcepcion {
        super(p);
    }
    
    public String getPlanetaProcedencia() {
        return planetaProcedencia;
    }

    public void setPlanetaProcedencia(String planetaProcedencia) {
        this.planetaProcedencia = planetaProcedencia;
    }
    
    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModificar1 = 0, atributoModificar2 =0;
        do {
            atributoModificar1 = aleatorio.nextInt(3)+1;
            atributoModificar2 = aleatorio.nextInt(3)+1;
        } while (atributoModificar1 == atributoModificar2);
        
        if (atributoModificar1 == 1 || atributoModificar2 == 1) {
            enemigo.setFuerza((int)(enemigo.getFuerza()*0.5));
        }
        if (atributoModificar1 == 2 || atributoModificar2 == 2){
            enemigo.setAgilidadFisica((int)(enemigo.getAgilidadFisica()*0.5));
        }
        if (atributoModificar1 == 3 || atributoModificar2 == 3){
            enemigo.setAgilidadMental((int)(enemigo.getAgilidadMental()*0.5));
        }
    }
    
}
