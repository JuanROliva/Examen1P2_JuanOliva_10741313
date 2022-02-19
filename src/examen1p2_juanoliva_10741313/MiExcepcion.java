package examen1p2_juanoliva_10741313;

import java.util.Date;

public class MiExcepcion extends Exception{
    private Date date;

    public MiExcepcion(String message) {
        super(message);
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    @Override
    public String toString() {
        return super.getMessage() + " error encontrado el " + date;
    }
}
