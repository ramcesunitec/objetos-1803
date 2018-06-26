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
public class GeneradorTarjetas {
    private ArrayList<Cliente>clientes;
    
   public GeneradorTarjetas() {
        this.clientes=new ArrayList<>();
        
        Tarjeta t1=new Tarjeta(1234, "Banamex", 32000);
        Cliente c1=new Cliente(t1, "Juan");
        
        Tarjeta t2=new Tarjeta(5678,"HSBC", 17500);
        Cliente c2=new Cliente(t2, "Ana");
        
        Tarjeta t3=new Tarjeta(8765,"Scotia", 19600);
        Cliente c3=new Cliente(t3,"Pedro");
        
        Tarjeta t4=new Tarjeta(4321,"Bancomer", 48000);
        Cliente c4=new Cliente(t4,"Irma");
        
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    

    
    
    
    
    
}
