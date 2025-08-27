/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador;

/**
 *
 * @author Gerson
 */
public class Empleado implements Trabajador, Comedor, Durmiente{
    public void trabajar() {
        System.out.println("Empleado trabajando en oficina...");
    }

    public void comer() {
        System.out.println("Empleado comiendo en la cafetería...");
    }

    public void dormir() {
        System.out.println("Empleado durmiendo en su casa...");
    }
}
