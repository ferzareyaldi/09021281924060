/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No7 {
    public static void main(String[] args){
        Scanner myInput = new Scanner (System.in);
        
        int nilaiangka;
        
        System.out.print("Nilai Angka \t: ");
        nilaiangka = myInput.nextInt();
        
       
        if ((nilaiangka <= 0)||(nilaiangka > 100)){ 
            System.out.println("Nilai angka tidak Valid"); 
        } else if (nilaiangka <= 30){
            System.out.println("Nilai Huruf \t: E");
        } else if (nilaiangka <= 50 ){
            System.out.println("Nilai Huruf \t: D");
        } else if (nilaiangka <= 70){
            System.out.println("Nilai Huruf \t: C");
        } else if (nilaiangka <= 80){
            System.out.println("Nilai Huruf \t: B");
        } else if (nilaiangka <= 100){
            System.out.println("Nilai Huruf \t: A");
        }
          
}
}
