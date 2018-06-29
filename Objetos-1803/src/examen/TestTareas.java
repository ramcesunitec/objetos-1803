/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.*;

/**
 *
 * @author T-101
 */
public class TestTareas {
    
    private ArrayList<Tarea>tareas;

    public TestTareas() {
        this.tareas=new ArrayList<>();
        
        Tarea t1=new Tarea(true, "Hacer examen parcial", 120);
        tareas.add(t1);
    }                    

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public static void main(String[] args) {
        for(Tarea t:new TestTareas().getTareas()){ 
            System.out.println(t);
        }
    }
       
}
 
