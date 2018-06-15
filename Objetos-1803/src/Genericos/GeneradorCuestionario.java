/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.ArrayList;

/**
 *
 * @author ramce
 */
public class GeneradorCuestionario {
    private Cuestionario cuestionario;
    public GeneradorCuestionario(){
        cuestionario=new Cuestionario();
        Opcion o11=new Opcion();
        //o1(opcion)1(pregunta)
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        
        Opcion o21=new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        
        Opcion o31=new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        
        Opcion o41=new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
   
        //Generamos la pregunta
        Pregunta p11=new Pregunta();
        p11.setTitulo("¿Cual es la capital de España?");
            //Antes generamos el ArrayList con las opciones de arriba 
        ArrayList<Opcion>opcionesp11=new ArrayList<>();
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
            //Este ArrayList lo agregamos a la primer pregunta
        p11.setOpciones(opcionesp11);
        
        //Cuestionario
        
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        cuestionario.setPreguntas(preguntas);
    }
    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
    
}
