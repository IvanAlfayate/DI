/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaContacto;

/**
 *
 * @author ivana
 */
public class Contacto {

    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
    private String[] informacion;

    public Contacto(String nombre, String apellido, String edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[] datos() {

        informacion[0] = nombre;
        informacion[1] = apellido;
        informacion[2] = edad;
        informacion[3] = telefono;
        return informacion;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + '}';
    }

}
