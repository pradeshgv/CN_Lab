/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FTP;

/**
 *
 * @author prade
 */
import java.io.*;
public class ftp {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fin=new FileInputStream("C:\\Users\\prade\\OneDrive\\Documents\\Aakash.pdf");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\prade\\OneDrive\\Pictures\\output2.pdf");
        byte buffer[]=new byte[4*1024];
        int i=0;
        while((i=fin.read(buffer))!=-1)
        {
            fout.write(buffer);
        }
    }
    
}
