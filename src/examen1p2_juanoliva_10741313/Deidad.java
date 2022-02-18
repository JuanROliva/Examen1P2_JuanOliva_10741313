package examen1p2_juanoliva_10741313;
public class Deidad extends Extraterrestre{
    private boolean tieneCreyentes;
    private String mitologiaReligion;

    public Deidad() {
        super();
    }

    public Deidad(boolean tieneCreyentes, String mitologiaReligion, String nombre, String poder, String debilidad, boolean tipoPersona, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, fuerza, agilidadFisica, agilidadMental);
        this.tieneCreyentes = tieneCreyentes;
        this.mitologiaReligion = mitologiaReligion;
    }

    public Deidad(Persona p, boolean tieneCreyentes, String mitologiaReligion) {
        super(p);
        this.tieneCreyentes = tieneCreyentes;
        this.mitologiaReligion = mitologiaReligion;
    }

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getMitologiaReligion() {
        return mitologiaReligion;
    }

    public void setMitologiaReligion(String mitologiaReligion) {
        this.mitologiaReligion = mitologiaReligion;
    }

    @Override
    public void ultimaOportunidad(Persona enemigo) {
        setFuerza((int)(getFuerza()*4));
        setAgilidadFisica((int)(getAgilidadFisica()*4));
        setAgilidadMental((int)(getAgilidadMental()*4));
        enemigo.setFuerza((int)(enemigo.getFuerza()*0.5));
        enemigo.setAgilidadFisica((int)(enemigo.getAgilidadFisica()*0.5));
        enemigo.setAgilidadMental((int)(enemigo.getAgilidadMental()*0.5));
    }
    
    

    
    
    
    
    
    
}
