/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificacion;

/**
 *
 * @author Gerson
 */
public class TelegramServicio implements CanalNotificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje de Telegram: " + mensaje);
    }
}
