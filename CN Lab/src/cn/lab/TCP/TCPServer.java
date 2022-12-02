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
public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps=new PrintStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String msg="";
        do {            
            msg=br.readLine();
            System.out.print("Client: "+msg);
            if(msg.equals("bye"))
                break;
            System.out.print("\nServer: ");
            msg=sc.nextLine();
            ps.println(msg);
        } while (!msg.equals("bye"));
    }
}
