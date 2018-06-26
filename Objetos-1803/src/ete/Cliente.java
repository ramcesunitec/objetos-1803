/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author ramce
 */
public class Cliente {
    
    private Tarjeta tarjeta;
    private String nombre;

    public Cliente() {
    }

    public Cliente(Tarjeta tarjeta, String nombre) {
        this.tarjeta = tarjeta;
        this.nombre = nombre;
    }

      
    
    
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "tarjeta=" + tarjeta + ", nombre=" + nombre + '}';
    }
    
    
}
