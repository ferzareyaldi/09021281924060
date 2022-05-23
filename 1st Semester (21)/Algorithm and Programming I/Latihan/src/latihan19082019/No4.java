/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No4 {

    public static void main(String[] args){
    Scanner myInput = new Scanner(System.in);
    System.out.print("Gaji Pokok = ");
    long gajipokok;
        gajipokok = myInput.nextLong();
    
    int statuskawin;
    long tunjanganistri = 0;
        System.out.print("Status Kawin (Kawin=1/Lajang=0) = ");
        statuskawin = myInput.nextInt();
        if (statuskawin == 1){
                tunjanganistri = 500000;}
        if (statuskawin == 0){
                tunjanganistri = 0;}
 
        
    int jumlahanak;
    long tunjangananak = 0;
        System.out.print("Jumlah Anak = ");
        jumlahanak = myInput.nextInt();
    if (jumlahanak == 0){tunjangananak = 0;}
    else if (jumlahanak == 1){tunjangananak = 100000;}
    else if (jumlahanak >= 2){tunjangananak = 200000;}
    
   
        System.out.println("gajitotal = " + (gajipokok + tunjangananak + tunjanganistri)); 
    
    
}
    
    
}
