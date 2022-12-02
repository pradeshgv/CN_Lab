
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prade
 */
public class pop {
    public static void main(String[] args) throws Exception{
    Properties p=new Properties();
    p.put("mail.pop3.host","pop.gmail.com");
    p.put("mail.pop3.port", "995");
    p.put("mail.pop3.starttls.enable", "true");
    Session s=Session.getDefaultInstance(p);
    Store ss=s.getStore("pop3s");
    ss.connect("pop.gmail.com","fastridezapp@gmail.com","ipur dwdh ohuc lhib");
    Folder f=ss.getFolder("INBOX");
    f.open(Folder.READ_ONLY);
        Message m[]=f.getMessages();
        int rec=m.length-1;
        Message recent=m[rec];
        recent.writeTo(System.out);
    }
    
}
