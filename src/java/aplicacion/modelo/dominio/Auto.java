package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Auto implements Serializable{
    private String patente;
    private String tipo;
    private int puertas;
    private String color;
    private Conductor conductor;
    public Auto() {
        
    }

    public Auto(String patente, String tipo, int puertas, String color, Conductor conductor) {
        this.patente = patente;
        this.tipo = tipo;
        this.puertas = puertas;
        this.color = color;
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
    
}
