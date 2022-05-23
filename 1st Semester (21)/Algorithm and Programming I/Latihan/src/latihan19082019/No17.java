package latihan19082019;

import java.util.Scanner;

public class No17 {
    public static void main(String[] args){
    Scanner myInput = new Scanner (System.in);
    String[]lampu = {"OFF", "ON"};
        System.out.print("Pilih angka digital yang ingin dibentuk (0 sampai 9) : ");
    int pilihan = myInput.nextInt();
    if (pilihan == 0){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[1]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 1){
        System.out.println("1 = " + lampu[0]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[0]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[0]);
        System.out.println("7 = " + lampu[0]);
    } else if (pilihan == 2){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[0]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[1]);
        System.out.println("6 = " + lampu[0]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 3){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[0]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 4){
        System.out.println("1 = " + lampu[0]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[0]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 5){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[0]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 6){
        System.out.println("1 = " + lampu[0]);
        System.out.println("2 = " + lampu[0]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[1]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 7){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[0]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[0]);
        System.out.println("7 = " + lampu[0]);
    } else if (pilihan == 8){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[1]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else if (pilihan == 9){
        System.out.println("1 = " + lampu[1]);
        System.out.println("2 = " + lampu[1]);
        System.out.println("3 = " + lampu[1]);
        System.out.println("4 = " + lampu[1]);
        System.out.println("5 = " + lampu[0]);
        System.out.println("6 = " + lampu[1]);
        System.out.println("7 = " + lampu[1]);
    } else {
        System.out.println("Nilai yang kamu masukan tidak valid");
    }
    }
    
    
}
