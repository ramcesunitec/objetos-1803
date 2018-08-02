/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author T-101
 */
public class Producto {
   private String nombredelProducto;
   private int unidades;
   private float costo;

    public Producto() {
    }

    public Producto(String nombredelProducto, int unidades, float costo) {
        this.nombredelProducto = nombredelProducto;
        this.unidades = unidades;
        this.costo = costo;
    }
   
   
   
    public String getNombredelProducto() {
        return nombredelProducto;
    }

    public void setNombredelProducto(String nombredelProducto) {
        this.nombredelProducto = nombredelProducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
   
   
    
}
