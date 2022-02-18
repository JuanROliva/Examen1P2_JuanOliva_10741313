package examen1p2_juanoliva_10741313;
public abstract class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private boolean tipoPersona; //True -> Heroe : : False: -> Villano
    private Escuadron escuadron;
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, 
            boolean tipoPersona, Escuadron escuadron, int fuerza, 
            int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tipoPersona = tipoPersona;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
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

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
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
        if (tipoPersona) return nombre + " " + poder;
        return nombre + " " + debilidad;
    }
    
    public boolean compararNombre(Persona p){
       return p.getNombre().toLowerCase().equals(nombre);
    }
    
    public abstract void ultimaOportunidad(Persona enemigo);
    
}
