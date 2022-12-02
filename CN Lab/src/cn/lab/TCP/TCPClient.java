/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.lab.TCP;

/**
 *
 * @author prade
 */
import java.io.*;
import java.util.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",5000);
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps=new PrintStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String msg="";
        do {            
            
            System.out.print("Client: ");
            msg=sc.nextLine();
            ps.println(msg+"\n");
            if(msg.equals("bye"))
                break;
            msg=br.readLine();
            System.out.println("Server: "+msg);
        } while (!msg.equals("bye"));
    }
}
