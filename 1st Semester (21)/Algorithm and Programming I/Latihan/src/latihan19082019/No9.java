/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;


public class No9 {
    public static void main(String[] args){
        
        Scanner myInput = new Scanner(System.in);
        int n, U = 0, S = 0;
        
        System.out.print("n = ");
        n = myInput.nextInt();
        
        for (int N = 1; N <= n; N++){
            U += 3;
            S += U;
        }

        System.out.print("S = " + S);
        
    }
}
