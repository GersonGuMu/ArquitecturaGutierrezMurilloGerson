/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrincipiosSOLID;

/**
 *
 * @author Gerson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNotificacion notificacion;

        notificacion = new NotificacionEmail();
        notificacion.enviar("Hola por Email");

        notificacion = new NotificacionSMS();
        notificacion.enviar("Hola por SMS");

        notificacion = new NotificacionWhatsApp();
        notificacion.enviar("Hola por WhatsApp");
    }
    
}
