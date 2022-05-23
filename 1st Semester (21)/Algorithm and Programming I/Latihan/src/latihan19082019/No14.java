/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No14 {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        
        long nilaifaktorial, p, n;
        nilaifaktorial = 1;
        
        System.out.print("n = ");
        n = myInput.nextLong();
        
        for (p = 1; p <= n; p++){
            nilaifaktorial = nilaifaktorial * p;
        }
        System.out.println(n + "! = " + nilaifaktorial);
       
        
      
        
    
    }
}