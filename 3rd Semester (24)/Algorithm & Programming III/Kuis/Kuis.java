import java.util.Scanner;

/**
 * @author Ferza Reyaldi
 */
public class Kuis {

    static float persamaanKurva(float x){
        return x * x + 1;
    }

    static float luasSegmen(float xKiri, float xKanan, float delta){
        float luasSegmen = 0;
        while (xKiri < xKanan){
            luasSegmen += 0.5 * (persamaanKurva(xKiri) + persamaanKurva(xKiri + delta)) * delta;
            xKiri += delta;
        }
        return luasSegmen;
    }

    public static void main(String[] args) {
        float x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Masukkan x1: ");
            x1 = scanner.nextFloat();
            System.out.print("Masukkan x2: ");
            x2 = scanner.nextFloat();
            System.out.print("Masukkan delta: ");
            delta = scanner.nextFloat();
            if (!(x1 < x2 && delta > 0))
                System.out.println("Masukkan tidak tepat");
        } while (!(x1 < x2 && delta > 0));
        scanner.close();
        System.out.println(luasSegmen(x1, x2, delta));
    }    
}