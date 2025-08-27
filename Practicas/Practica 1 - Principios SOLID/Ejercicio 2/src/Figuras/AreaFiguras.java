/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;

/**
 *
 * @author Gerson
 */
public class AreaFiguras {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(4, 6);
        System.out.println("Area del carculo: " + calc.calcularArea(c));
        System.out.println("Area del rectangulo: " + calc.calcularArea(r));
        Triangulo t = new Triangulo(3, 4);
        System.out.println("Area del triangulo: " + calc.calcularArea(t));
    }

    
}
