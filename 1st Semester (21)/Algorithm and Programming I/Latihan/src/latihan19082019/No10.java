/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No10 {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        int alpro1 = 0, matematika = 0, logika = 0;
        double ratarata;
        
        while(logika==0){
            while(matematika==0){
                while(alpro1==0){
                    System.out.print("Masukan Nilai Alpro1 \t: ");
                    alpro1 = myInput.nextInt();
                }
                    System.out.print("Masukan Nilai Matematika \t: ");
                    matematika = myInput.nextInt();
                    if (matematika==0){
                        alpro1 = 0;
                        System.out.println();
                    }
            }
                    System.out.print("Masukan Nilai Logika \t: ");
                    logika = myInput.nextInt();
                    if (logika==0){
                        matematika = 0; 
                        alpro1 = 0;
                        System.out.println();
                    }
        }
        
        ratarata = (double) (alpro1+matematika+logika)/3;
        System.out.println("Nilai Rata-rata \t: " + ratarata);
        
    }
    
}
