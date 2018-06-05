/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author ramce
 */
public class Honorarios extends Trabajador{

    @Override
    public void pagar() {
        System.out.println("SE VA A PAGAR AUN TRABAJADOR POR HONORARIOS");
    }
    
}
