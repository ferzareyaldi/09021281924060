/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args){
    
    Scanner myinput = new Scanner(System.in);
    float a, b, c;
        System.out.print("a = ");
        a = myinput.nextFloat();
        System.out.print("b = ");
        b = myinput.nextFloat();
        System.out.print("c = ");
        c = myinput.nextFloat();
    
    float ratarata = (a+b+c)/3;
        System.out.println("Rata-Rata 3 Variabel = " + ratarata);
    }
    
}
