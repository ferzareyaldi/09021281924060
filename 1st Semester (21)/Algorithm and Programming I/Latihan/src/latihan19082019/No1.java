/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

public class No1 {

    static int LuasSegiEmpat(int P, int L){
        int LUAS = P * L;
        return LUAS;
        
    }
    public static void main(String[] args) {
    int p,l,luas;
    p = 10;
    l = 3;
    //P adalah Panjang Persegi, L adalah Lebar Persegi
    luas = LuasSegiEmpat(p,l);
    
        System.out.println("Luas Persegi Panjang = " + luas);
    
        
    }
        
    
}
