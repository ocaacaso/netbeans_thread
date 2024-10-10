/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadInterrupted;
/**
 *
 * @author frida
 */
public class CicloConcorrenteInterr implements Runnable {
    @Override
    public void run() {
       for(int i=0; !Thread.interrupted(); i++) {
            System.out.println("Thread Ciclo" + i);
        }
        System.out.println("Il Thread si e' interrotto");
    }
}

