/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipiosSOLID;

/**
 *
 * @author Gerson
 */
public class ServicioNotificacion {
    private CanalNotificacion canal;

    public ServicioNotificacion(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void enviarMensaje(String mensaje) {
        canal.enviar(mensaje);
    }
}
