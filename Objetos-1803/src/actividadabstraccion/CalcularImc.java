/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadabstraccion;

/**
 *
 * @author ramce
 */
public class CalcularImc {
    private Usuario usuario;
    
    public float Imc(){
        float resultado=usuario.getPeso()/(usuario.getAltura()*usuario.getAltura());
        return resultado;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    void Imc(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
