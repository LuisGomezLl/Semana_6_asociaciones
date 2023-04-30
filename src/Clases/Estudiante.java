/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USER
 */
public class Estudiante {
    
    private String codigo;
    private String Nombre;

    public Estudiante(String codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }
    
    public Estudiante() {
        this.codigo = null;
        this.Nombre = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
    
    
    
}
