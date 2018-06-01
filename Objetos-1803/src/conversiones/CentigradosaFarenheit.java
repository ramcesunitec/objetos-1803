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
public class CentigradosaFarenheit implements Conversion{

    @Override
    public float convertir(float grados) {
        float resultado=(grados*1.8f)+32;
        return resultado;
    }

    @Override
    public String toString() {
        return "Centigrados a Farenheit";
    }

    
}
