/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

public class No12 {
    static int LuasSisi(int X, int Y){
        int Luas = X*Y;
        return Luas;
    }
    
    static int LuasSelimut(int X, int Y, int Z){
        int Luas = 2*(X+Y)*Z;
        return Luas;
    }
    public static void main(String[] args){
        int p = 9, l = 6, t = 3;
        
        int LuasSisiDepanBelakang = LuasSisi(p,t);
        System.out.println("Luas Sisi Depan/Belakang = " + LuasSisiDepanBelakang);
        
        int LuasSisiSamping = LuasSisi(l,t);
        System.out.println("Luas Sisi Samping = " + LuasSisiSamping);
        
        int LuasSisiAlasAtas = LuasSisi(p,l);
        System.out.println("Luas Sisi Alas/Atas = " + LuasSisiAlasAtas);
        
        int LuasSelimut = LuasSelimut(p,l,t);
        System.out.println("Luas Selimut = " + LuasSelimut);
        
    }
}
