package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Auto;
import aplicacion.modelo.dominio.Conductor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorAutos implements Serializable{
    private ArrayList<Auto> listaAutos;


    public GestorAutos() {
        Conductor conductor1 = new Conductor("Guido", "Wolf", 18, 38164157, new Date(1994-1900, 6, 8));
        Conductor conductor2 = new Conductor("Nacho", "Delestal", 20, 39147204,new Date(1993-1900, 8, 2));
        Auto coche1 = new Auto("AA 000 BB","Camion", 2, "Gris", conductor1);
        Auto coche2 = new Auto("AD 471 AC","Auto", 3, "Gris", conductor1);
        Auto coche3 = new Auto("BA 770 XS","Auto", 5, "Verde", conductor2);
        
        listaAutos = new ArrayList<Auto>(); 
        listaAutos.add(coche1);
        listaAutos.add(coche2);
        listaAutos.add(coche3);
               
    }
    
    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }    
    
}
