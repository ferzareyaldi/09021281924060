/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;
public class No15 {
    public static void main(String[] args){
        Scanner myInput = new Scanner (System.in);
        
        int N,n;
        
        System.out.print("N : " );
        N = myInput.nextInt();
        
    while (N>0){
        for (n=N;n>=1;n--){
            System.out.print("* ");
        }
        --N;
        System.out.println();
    }
        
    }
}
