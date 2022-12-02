/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMTP;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author prade
 */
public class smtp {
    public static void main(String[] args) throws Exception{
        Properties p=new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "465");
        p.put("mail.smtp.ssl.enable", "true");
        p.put("mail.smtp.auth", "true");
        Session s=Session.getInstance(p,new javax.mail.Authenticator() { 
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kuregamikai@gmail.com","aqwi gygo lxgw mciz"); 
            }

        });
        MimeMessage m=new MimeMessage(s);
        m.setFrom("kuregamikai@gmail.com");
        m.addRecipients(Message.RecipientType.TO, "pradeshgv@gmail.com");
        m.setSubject("Hi");
        m.setText("Hello");
        Transport.send(m);
    }
    
}
