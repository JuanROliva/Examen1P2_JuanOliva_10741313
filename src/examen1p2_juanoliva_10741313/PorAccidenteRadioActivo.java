package examen1p2_juanoliva_10741313;

import java.util.Random;

public class PorAccidenteRadioActivo extends Persona{
    private int edadAccidente;
    private String tipoAccidente;

    public PorAccidenteRadioActivo() {
        super();
    }

    public PorAccidenteRadioActivo(int edadAccidente, String tipoAccidente, String nombre, String poder, String debilidad, boolean tipoPersona, Escuadron escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, tipoPersona, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        return "PorAccidenteRadioActivo: " + super.toString();
    }

    @Override
    public void ultimaOportunidad(Persona enemigo) {
        Random aleatorio = new Random();
        int atributoModifcar = aleatorio.nextInt(3)+1;
        switch (atributoModifcar) {
            case 1 -> setFuerza((int)(getFuerza()*4));
            case 2 -> setAgilidadFisica((int)(getAgilidadFisica()*4));
            case 3 -> setAgilidadMental((int)(getAgilidadMental()*4));
        }
    }
    
    
    
    

    
    
    
}
