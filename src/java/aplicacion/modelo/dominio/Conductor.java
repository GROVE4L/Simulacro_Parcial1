package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rojas, Guido G.
 */
public class Conductor implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Date fechaNacimiento;
    
    public Conductor() {
        
    }

    public Conductor(String nombre, String apellido, int edad, long dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }    

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    
}
