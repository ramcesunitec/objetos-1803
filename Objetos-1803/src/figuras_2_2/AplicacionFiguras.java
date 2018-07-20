/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_2_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramce
 */
public class AplicacionFiguras {
    public static void main(String[] args) {
        
        try {
            //Primero creamos un objeto de tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //Ajustamos el valor del lado
            ValidarValores.validarNoNegativo(-4);
            c.setLado(-4);
            
            //Generamos un objeto de tipo calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
            
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
