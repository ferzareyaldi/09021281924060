/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19082019;

import java.util.Scanner;

public class No6 {

    static void menu() {
        System.out.println("Jenis Minuman (Kode Minuman)");
        System.out.println("- Milo (1)       = 7500");
        System.out.println("- Kopi (2)       = 4000");
        System.out.println("- Teh Botol (3)  = 3500");
        System.out.println("- Jus Mangga (4) = 5000");
    }

    static double pesan() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Apakah anda ingin membeli(iya/tidak)? ");
        String p = myInput.nextLine();
        double Total = 0;
        while ("iya".equals(p)) {
            System.out.print("Masukkan Kode Minuman : ");
            int q = myInput.nextInt();
            int r;

            switch (q) {
                case 1:
                    System.out.print("Berapa Banyak? ");
                    r = myInput.nextInt();
                    Total += 7500 * r;
                    break;
                case 2:
                    System.out.print("Berapa Banyak? ");
                    r = myInput.nextInt();
                    Total += 4000 * r;
                    break;
                case 3:
                    System.out.print("Berapa Banyak? ");
                    r = myInput.nextInt();
                    Total += 3500 * r;
                    break;
                case 4:
                    System.out.print("Berapa Banyak? ");
                    r = myInput.nextInt();
                    Total += 5000 * r;
                    break;       
            }
            System.out.println("Apakah anda ingin memesan lagi? ");
            p = myInput.nextLine();
        }
        return diskon(Total);
    }
    
    static double diskon(double x){
        double Harga = x;
        if (x>100000)
        {
            Harga = x - 0.15*x;   
        }
        else if(x>50000 && x <=100000)
        {
            Harga = x - 0.075*x;
        }
        return Harga;
    }

    public static void main(String[] args) {
        long milo = 7500, kopi = 4000, tehbotol = 3500, jusmangga = 5000;
        menu();
        System.out.println("Total yang harus dibayar = " + pesan());
    }

}
