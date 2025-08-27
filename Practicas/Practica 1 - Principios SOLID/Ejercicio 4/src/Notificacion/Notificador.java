/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificacion;

/**
 *
 * @author Gerson
 */
public class Notificador {
    private CanalNotificacion canal;

    // ✅ Inyección por constructor
    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    // ✅ Opción alternativa: Inyección por setter
    public void setCanal(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void notificar(String mensaje) {
        canal.enviar(mensaje);
    }
}
