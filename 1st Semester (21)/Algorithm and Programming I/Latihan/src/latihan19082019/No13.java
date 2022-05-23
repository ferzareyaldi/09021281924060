/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No13 {
    
    static void Luas(double P, double L, double p, double l){
        
        double luas1 = P * L;
        double luas2 = p * l;
        double luasarsir = luas1 - luas2;
        System.out.println("Luas daerah yang diarsir adalah " + luasarsir);
    }
    
    public static void main(String[] args){
        Scanner myInput = new Scanner (System.in);
        double p,l,P,L;
        System.out.print("p :");
        p = myInput.nextDouble();
        System.out.print("l :");
        l = myInput.nextDouble();
        System.out.print("P :");
        P = myInput.nextDouble();
        System.out.print("L :");
        L = myInput.nextDouble();
        //luas1 adalah luas segiempat luar dan luas2 adalah luas segiempat dalam
        Luas(P,L,p,l);
        
    }   
}
