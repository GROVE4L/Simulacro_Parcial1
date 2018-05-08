package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Auto;
import aplicacion.modelo.util.GestorAutos;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class Punto2FormBean implements Serializable{
    
    private ArrayList<Auto> listaAutos;
    private String colorIngresado;    
    private ArrayList<String> listaColores;
    
    public Punto2FormBean() {
        GestorAutos listaAutos = new GestorAutos();
        this.listaAutos = listaAutos.getListaAutos();
        this.listaColores = new ArrayList<String>();
        listaColores.add("Verde");
        listaColores.add("Gris");
        listaColores.add("Magenta");        
        listaColores.add("Mystic Blue");
        listaColores.add("Rosa");
        
    }

    public void reiniciarLista() {
        GestorAutos listaAutos = new GestorAutos();
        this.listaAutos = listaAutos.getListaAutos();
        this.listaColores = new ArrayList<String>();
        listaColores.add("Verde");
        listaColores.add("Gris");
        listaColores.add("Magenta");        
        listaColores.add("Mystic Blue");
        listaColores.add("Rosa");
    }
    
    public void buscarColores(){
        this.reiniciarLista();
        ArrayList<Auto> listaAux = new ArrayList<Auto>();
        for(Auto a: this.listaAutos) {
            if(a.getColor().compareToIgnoreCase(this.colorIngresado) == 0)
                listaAux.add(a);
        }
        this.listaAutos = listaAux;
    }
    
    public ArrayList<String> getListaColores() {
        return listaColores;
    }

    public void setListaColores(ArrayList<String> listaColores) {
        this.listaColores = listaColores;
    }
    
    
    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public String getColorIngresado() {
        return colorIngresado;
    }

    public void setColorIngresado(String colorIngresado) {
        this.colorIngresado = colorIngresado;
    }
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Auto editado ", ((Auto) event.getObject()).getPatente());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada ", ((Auto) event.getObject()).getPatente());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }     
    
}
