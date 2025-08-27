/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Notificacion;

/**
 *
 * @author Gerson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inyección por constructor
        Notificador notificadorEmail = new Notificador(new EmailServicio());
        notificadorEmail.notificar("Hola Carlos, tienes un correo nuevo.");

        // Inyección por setter
        Notificador notificadorTelegram = new Notificador(new EmailServicio()); // inicial cualquiera
        notificadorTelegram.setCanal(new TelegramServicio()); // cambiamos a Telegram dinámicamente
        notificadorTelegram.notificar("Hola Carlos, tienes un mensaje en Telegram.");
    }
    
}
