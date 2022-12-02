/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DNS;

/**
 *
 * @author prade
 */
import java.net.*;
public class dns {
    public static void main(String args[]) throws Exception
    {
        InetAddress ia=InetAddress.getByName("www.amazon.in");
        System.out.println(ia.getHostAddress()+ia.getHostName());
        InetAddress iaa2=InetAddress.getByName(ia.getHostAddress());
        System.out.println(iaa2.getHostAddress()+iaa2.getHostName());
    }
    
}
