/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas1_2_3;

/**
 *
 * @author ramce
 */
public class Threadsito extends Thread{
    
    public void run(){
        System.out.println("Soy un thread y me llamo "+Thread.currentThread().getName());
    }
    
}
