/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author ramce
 */
public class Aplicacion {
    public static void main(String[] args)throws Exception{
        
        for(Cliente c:PersistenciaUsuario.leer()){
          System.out.println("Nombre "+c.getNombre());
        }
        //Cliente c=PersistenciaUsuario.leer();
        //System.out.println("VAMOS A CHECAR EL NOMBRE "+c.getNombre());
        
       /*Cliente c=new Cliente();
        c.setNombre("ESTRELLA");
        c.setEdad(15);
        PersistenciaUsuario.guardar(c);
        */
    }
   
}
