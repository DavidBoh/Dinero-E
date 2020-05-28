/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author herrboh
 */
public class EmailVerification {

    /**
     * @param args the command line arguments
     */
    
    Random rand = new Random();
    String codex = String.format("%04d", rand.nextInt(10000));
    
    public static void sendMail(String recepient, String mensajecodigo) throws Exception {
        System.out.println("Preparing");
        
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        
        
        //correo de origen
        String myAccountEMail = "knowit4llenglish@gmail.com";
        String password = "m4u5*A.C-";
        
        Session session = Session.getInstance(properties, new Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(myAccountEMail, password);
           }
        });
        
        Message message = prepareMessage(session, myAccountEMail, recepient, mensajecodigo);
    
        
        
        Transport.send(message);
        System.out.println("Message sent");


    }
    
    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, String mensajecodigo) {
        try{
            
            
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Recuperación contraseña DineroE");
            message.setText("Hello, \n this is a test");
            message.setFrom(new InternetAddress("dineroe@soporte", "DineroE"));
            String htmlCode = "<h1> Recuperacion cuenta DineroE </h1> <br/> <h2><b> Tu codigo es: </b></h2> " + mensajecodigo;
            message.setContent(htmlCode,"text/html");
            
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailVerification.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
}
