/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;
import java.util.*;
/**
 *
 * @author ramce
 */
public class ProbarCliente {
    public static void main(String[] args) {
        for(Cliente c:new GeneradorTarjetas().getClientes()){
            System.out.println(c);
        }
         
    }
}
