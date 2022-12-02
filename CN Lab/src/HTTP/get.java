/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HTTP;

import java.io.*;
import java.net.*;
public class get {
    public static void main(String[] args) throws Exception{
        URL nu=new URL("https://www.mitindia.edu");
        HttpURLConnection nc=(HttpURLConnection) nu.openConnection();
        nc.setRequestMethod("POST");
        BufferedReader br=new BufferedReader(new InputStreamReader(nc.getInputStream()));
        StringBuffer ans=new StringBuffer();
        String s="";
        while((s=br.readLine())!=null)
        {
            ans.append(s);
        }
        System.out.println(ans);
    }
    
}
