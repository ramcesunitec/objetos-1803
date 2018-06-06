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
public class FarenheitaCentigrados extends Conversion{

    @Override
    public float convertir(float gradosF) {
     float resultado=(gradosF-32f)/1.80f;
     return resultado;
    }

    @Override
    public String toString() {
        return "FarenheitaCentigrados";
    }
    
    
}
