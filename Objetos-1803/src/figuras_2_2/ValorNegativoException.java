/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_2_2;

/**
 *
 * @author ramce
 */
public class ValorNegativoException extends Exception{
    public ValorNegativoException(){
        super("NO SE PERMITEN VALORES NEGATIVOS");
    }
}
