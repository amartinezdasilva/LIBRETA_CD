/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretacontactos;


/**
 *los únicos métodos que tiene son getters y setters.
 * Permite agrupar los contactos en grupos.
 * @author AAron
 */
public class Grupo {
    private String nombre;
    private Contacto[] contactos;
    
    public Grupo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    
    
}
    

