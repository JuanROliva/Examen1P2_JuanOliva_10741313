package examen1p2_juanoliva_10741313;
public abstract class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private boolean tipoPersona; //True -> Heroe : : False: -> Villano
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, 
            boolean tipoPersona, int fuerza, 
            int agilidadFisica, int agilidadMental) throws MiExcepcion {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tipoPersona = tipoPersona;
        this.validacionDatos(fuerza, agilidadFisica, agilidadMental);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public boolean isTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(boolean tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
    
    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    @Override
    public String toString() {
        if (tipoPersona) return nombre + " poder: " + poder;
        return nombre + " debilidad: " + debilidad;
    }
    
    public boolean compararNombre(Persona p){
       return p.getNombre().toLowerCase().equals(nombre);
    }
    
    public void validacionDatos(int fuerza, int agilidadFisica, int agilidadMental) throws MiExcepcion{
        int suma = fuerza + agilidadFisica + agilidadFisica;
        if (suma < 100) throw new MiExcepcion("No tiene lo que se requiere para ser Heroe o Villano");
        if (suma > 150) throw new MiExcepcion("Se paso en sus elementos y no puede Heroe o Villano");
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }
    
    public abstract void ultimaOportunidad(Persona enemigo);
    
}
