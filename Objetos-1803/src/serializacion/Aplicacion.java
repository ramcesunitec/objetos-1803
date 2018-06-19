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
        //Se usa el modelo
        Cliente c=new Cliente();
        c.setEdad(20);
        c.setNombre("Ramces");
        c.setSueldo(1000);
        PersistenciaUsuario.guardar(c);
        System.out.println("GUARDADO CON EXITO");
    }
   
}
