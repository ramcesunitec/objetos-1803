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
import java.io.*;
public class PersistenciaUsuario {
    //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //Paso 1 Generar el archivo donde se va a guardar nuestro serializado
        File file=new File("C:\\Users\\ramce\\Documents\\archivaldo.yomero"); //Esta linea crea o sobrescribe un archivo
        
        //Paso 2 es indicar que lo vamos a generar para escribirlo en el 
        FileOutputStream fos =new FileOutputStream(file);
        
        //Paso 3 Escribir un objeto en el
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        
        
    }
    
}
