/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.threadInterrupted;

/**
 *
 * @author frida
 */
public class IntroThreadInterr {
    public static void main(String[] args) {
        CicloConcorrenteInterr cicloConcorrente = new CicloConcorrenteInterr();
        Thread threadCiclo = new Thread(cicloConcorrente);
        threadCiclo.start();
        for(int i=0;i<50;i++) {
            System.out.println("Main Ciclo: " + i);
            if(i==25) 
                threadCiclo.interrupt();
        }
    }
}
