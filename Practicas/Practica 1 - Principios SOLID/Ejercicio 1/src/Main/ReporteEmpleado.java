/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gerson
 */
public class ReporteEmpleado {
    public void imprimirReporte(Empleado empleado) {
        System.out.println("=== Reporte de Empleado " + empleado.getNombre() + " ===");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario Total: " + empleado.calcularSalario());
    }
}
