/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class Conversion {
    private Grados grados;
    
    public float centigradosAFarenheit(){
        //Este metodo tiene logica
        
        float resultado= (grados.getCentigrados()*1.8f)+32;
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    



    private Longitud longitud;
    
    public float metrosAPies(){
        float resultadoMaP=longitud.getMetros()*3.28f;
        return resultadoMaP;
    }
    

    public Longitud getLongitud() {
        return longitud;
    }

    public void setLongitud(Longitud longitud) {
        this.longitud = longitud;
    }
    
}
