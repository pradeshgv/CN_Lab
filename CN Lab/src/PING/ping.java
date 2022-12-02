/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PING;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author prade
 */

public class ping {
    public static void main(String[] args) throws Exception {
        Process p=Runtime.getRuntime().exec("getmac");
        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s="";
        while((s=br.readLine())!=null)
        System.out.println(s);
    }
}
