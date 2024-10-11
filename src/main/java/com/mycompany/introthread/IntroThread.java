/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.introthread;
/**
 *
 * @author frida
 */
public class IntroThread {
    public static void main(String[] args) {
        CicloConcorrente cicloConcorrente = new CicloConcorrente();
        Thread threadCiclo = new Thread(cicloConcorrente);
        threadCiclo.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ciclo principale del thread main: " + i);
        }
    }
}


//ciao