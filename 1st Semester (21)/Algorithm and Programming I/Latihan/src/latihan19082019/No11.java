/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

public class No11 {
    static int LuasSegiEmpat(int p, int l){
        int LS4 = p * l;    
        return LS4;
    }
    
    static double LuasSegitiga(int A, int T){
        double LS3 = (double)(A * T)/2;
        return LS3;
    }
    
    public static void main(String[]args){
    int a = 5, b = 4, c = 4, d = 5, e = 7, f = 5;
    int L1, L2;
    double L3, LuasTotal;
    
    L1 = LuasSegiEmpat(a,b);
    L2 = LuasSegiEmpat(c,d);
    L3 = LuasSegitiga(e,f);
    LuasTotal = L1+L2+L3;
    System.out.println("Luas Segiempat1 = " + L1);
    System.out.println("Luas Segiempat2 = " + L2);
    System.out.println("Luas Segitiga   = " + L3);
    System.out.println("Jadi Luas Total = " + LuasTotal);
    }
}
