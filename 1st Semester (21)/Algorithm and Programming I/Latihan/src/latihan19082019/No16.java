package latihan19082019;

import java.util.Scanner;
public class No16 {
    public static void main(String[] args){
    Scanner myInput = new Scanner (System.in);
    String[]lampu = {"OFF", "ON"};
        System.out.print("Pilih angka digital yang ingin dibentuk (0 atau 1) : ");
    int pilihan = myInput.nextInt();
    if (pilihan == 0){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
    } else if (pilihan == 1){
        System.out.println("1 = " + lampu[0]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[0]);
        System.out.println("4 = " + lampu[0]);
    }
    
    

    }
    
}
