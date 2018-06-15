/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.*;

/**
 *
 * @author ramce
 */
public class AplicacionPregunta {
    public static void main(String[] args) {
        //Generar las opciones
        GeneradorCuestionario generador=new GeneradorCuestionario();
        
        for(Pregunta p:generador.getCuestionario().getPreguntas()){
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
            
        }
        
    }
}
