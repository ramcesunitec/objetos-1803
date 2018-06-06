/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

/**
 *
 * @author ramce
 */
public class PiesaMetros extends Conversion{

    @Override
    public float convertir(float longitudFt) {
      float resultado=longitudFt/3.28f;
      return resultado;
    }

    @Override
    public String toString() {
        return "PiesaMetros";
    }
    
    
}
