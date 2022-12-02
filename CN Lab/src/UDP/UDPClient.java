/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

/**
 *
 * @author prade
 */
import java.net.*;
import java.util.*;
public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket spkt=new DatagramSocket(5001);
        Scanner sc=new Scanner(System.in);
        byte a[]=new byte[4*1024];
        DatagramPacket pkt=new DatagramPacket(a,a.length);
        String msg="";
        do {  
            System.out.print("\nClient: ");
            msg=sc.nextLine();
            a=msg.getBytes();
            spkt.send(new DatagramPacket(a,a.length,InetAddress.getLocalHost(),5000));
            if(msg.equals("bye"))
                break;
            spkt.receive(pkt);
            msg=new String(pkt.getData(),0,pkt.getLength());
            System.out.println("Server: "+msg);    
        } while (!msg.equals("bye"));
    }
    
}
