package aplicacion.controlador.beans.forms;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ValidarOpcionFormBean {
    
    private int opcionIngresada;
    
    public ValidarOpcionFormBean() {
    }    
    
    public int getOpcionIngresada() {
        return opcionIngresada;
    }
    
    public void setOpcionIngresada(int opcionIngresada) {
        this.opcionIngresada = opcionIngresada;
    }    
    public String irAOpcion() {
        switch(this.opcionIngresada) {
            case 1: return "punto1";
            case 2: return "punto2";
            case 3: return "punto3";
            default: return "null"; 
        }
    }
}
