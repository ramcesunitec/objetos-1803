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
public class CentigradosaFarenheit extends Conversion{

    @Override
    public float convertir(float gradosC) {
        float resultado=(gradosC*1.8f)+32f;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "CentigradosaFarenheit";
    }
    
    
}
