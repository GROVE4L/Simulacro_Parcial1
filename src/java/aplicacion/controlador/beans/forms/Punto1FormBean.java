package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class Punto1FormBean implements Serializable{

    private int n1Ingresado;
    private int n2Ingresado;
    public Punto1FormBean() {
    }

    public int sumarNumeros() {
        return (this.n1Ingresado+this.n2Ingresado);
    }
    
    public int getN1Ingresado() {
        return n1Ingresado;
    }

    public void setN1Ingresado(int n1Ingresado) {
        this.n1Ingresado = n1Ingresado;
    }

    public int getN2Ingresado() {
        return n2Ingresado;
    }

    public void setN2Ingresado(int n2Ingresado) {
        this.n2Ingresado = n2Ingresado;
    }
    
    
    
}
