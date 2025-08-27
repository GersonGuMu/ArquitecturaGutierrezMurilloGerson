/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajador;

/**
 *
 * @author Gerson
 */
public class Main {
    public static void main(String[] args) {
        Empleado humano = new Empleado();
        humano.trabajar();
        humano.comer();
        humano.dormir();

        Robot maquina = new Robot();
        maquina.trabajar();
    }
}
