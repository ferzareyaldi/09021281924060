/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No8 {
    public static void main(String[] args){
        
        Scanner myInput = new Scanner (System.in);
        int anakayam;
        System.out.print("Banyak Anak Ayam : ");
        anakayam = myInput.nextInt();
        
        while(anakayam > 1){
            System.out.print("Anak ayam turunlah " + anakayam);
            --anakayam;
            System.out.println(", mati satu tinggal " + anakayam);
        }
        System.out.println("Anak ayam turunlah 1, mati satu maka habis");
    }
    
}
