/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No19 {
    public static void main(String[] args){
        Scanner myInput = new Scanner (System.in);
        String []mk = {"Alpro1", "Fisika", "Agama"};
        int []nilaimk = new int[3];
        float avg;
        for (int i=0; i<nilaimk.length; i++){
            System.out.print(mk[i] + "\t: ");
            nilaimk[i] = myInput.nextInt();
        }
       avg = (nilaimk[0] + nilaimk[1] + nilaimk[2])/3;
        System.out.println("Rata-rata Nilai : " + avg);
    }
    
}
