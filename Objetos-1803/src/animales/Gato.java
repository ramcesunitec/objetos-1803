/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author ramce
 */
public class Gato extends Animal{

    @Override
    public String obtenerRuido() {
        return "miau";
    }
    
     @Override
    public String toString() {
        return "Gato";
    }
    
}
