package examen1p2_juanoliva_10741313;
public abstract class Extraterrestre extends Persona{

    public Extraterrestre() {
        super();
    }

    public Extraterrestre(String nombre, String poder, String debilidad,
            boolean tipoPersona, int fuerza, int agilidadFisica, 
            int agilidadMental) throws MiExcepcion {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
    }
    
    public Extraterrestre(Persona p) throws MiExcepcion {
        super(p.getNombre(), p.getPoder(), p.getDebilidad(), p.isTipoPersona(), 
                p.getFuerza(), p.getAgilidadFisica(), p.getAgilidadMental());
    }
    
}
