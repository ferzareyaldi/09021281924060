import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] kromosom_M = new char[5];
        char[] kromosom_F = new char[5];
        char[] kromosom_M_new = new char[5];
        char[] kromosom_F_new = new char[5];
        int length = kromosom_F.length;

        System.out.print("Kromosom M: ");
        for(int i = 0; i < length; i++){
            kromosom_M[i] = sc.next().charAt(0);
        }


        System.out.print("Kromosom F: ");
        for(int i = 0; i < length; i++){
            kromosom_F[i] = sc.next().charAt(0);
        }

        System.out.print("Posisi crossover: ");
        int crossover = sc.nextInt();
        sc.close();
        System.out.print("Kromosom M Baru: ");
        for(int i = 0; i < length; i++){
            if(i < crossover)
                kromosom_M_new[i] = kromosom_M[i];
            else
                kromosom_M_new[i] = kromosom_F[i];
            System.out.print(kromosom_M_new[i] + " ");
        }

        System.out.println();

        System.out.print("Kromosom F Baru: ");
        for(int i = 0; i < length; i++){
            if(i < crossover)
                kromosom_F_new[i] = kromosom_F[i];
            else
                kromosom_F_new[i] = kromosom_M[i];
            System.out.print(kromosom_F_new[i] + " ");
        }
    }
}
