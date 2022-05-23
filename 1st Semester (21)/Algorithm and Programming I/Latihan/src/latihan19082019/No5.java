/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No5 {
    public static void main(String[] args){
        
    long gajipokok, tunjangananak = 0;
    double pajak, tunjangankesehatan, gajitotal;
    int statuskawin, jumlahanak;
    
    Scanner myInput = new Scanner(System.in);
    
        System.out.print("Gaji Pokok : ");
        gajipokok = myInput.nextLong();
        if (gajipokok >3000000){
            pajak = 0.10 * gajipokok;
        } else {
            pajak = 0.05 * gajipokok;
        }
        
        tunjangankesehatan = 0.05 * gajipokok;
        
        System.out.print("Status Kawin (Kawin = 1 / Lajang = 0) : ");
        statuskawin = myInput.nextInt();
        
        if (statuskawin == 0){
            tunjangananak = 0;
        } else if (statuskawin == 1){
            System.out.print("Jumlah Anak : ");
            jumlahanak = myInput.nextByte();
            if (jumlahanak > 2){
                tunjangananak = 2 * 100000;
            } else if (jumlahanak > 0){
                tunjangananak = jumlahanak *100000;
        } else {
                tunjangananak =0;
            }
        }
        
        gajitotal = gajipokok + tunjangananak + tunjangankesehatan - pajak;
        System.out.println("Gaji Total : " + gajitotal);
        
                
        
    }
    
}
