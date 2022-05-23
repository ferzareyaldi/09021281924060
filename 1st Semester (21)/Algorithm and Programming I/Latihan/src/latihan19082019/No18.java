/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;


public class No18 {
    public static void main(String[] args){
        Scanner myInput = new Scanner (System.in);
        int[]nilai = new int[10];
        for (int i = 0; i<nilai.length; i++){
            System.out.print("Masukan Nilai elemen Array ke-" + (i+1) + " : ");
            nilai[i] = myInput.nextInt();
        }
        int nilaimin = nilai[0];
        for (int i =0; i<nilai.length; i++){
            if(nilaimin > nilai [i] ){
                nilaimin = nilai[i];
            }
        }
        System.out.print("NILAI ELEMEN ARRAY YANG TERKECIL : " + nilaimin);
    }
    
}
