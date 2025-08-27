/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Liskov;

/**
 *
 * @author Gerson
 */
public class Aves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ave pinguino = new Pinguino();
        Ave avestruz = new Avestruz();
        pinguino.comer();   
        avestruz.comer();   
        AveQueVuela gorrion = new Gorrion();
        AveQueVuela aguila = new Aguila();
        gorrion.comer();    
        gorrion.volar();    
        aguila.comer();     
        aguila.volar();     
        Ave ave1 = new Aguila();
        Ave ave2 = new Pinguino();
        ave1.comer();  
        ave2.comer();  
    }
    
}
