/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipiosSOLID;

/**
 *
 * @author Gerson
 */
public class NotificacionTelegram implements CanalNotificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando Telegram: " + mensaje);
    }
}
