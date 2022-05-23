/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No3 {
    public static void main(String[] args){
        
        Scanner MyInput = new Scanner (System.in);
        System.out.print("N = ");
        int N;
        N = MyInput.nextInt();
         
       while(N>0){
           System.out.print("Tinggi " + N);
           --N;
           System.out.println(", mantul turun menjadi " + N);
       }
        System.out.println("Tinggi " +N+ ", Tidak Mantul");
      
    }
}