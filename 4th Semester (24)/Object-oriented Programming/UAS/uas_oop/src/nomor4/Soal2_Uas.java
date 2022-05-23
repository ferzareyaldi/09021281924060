package nomor4;

public class Soal2_Uas {

    public static void main( String[] args )
    {
        Point P1= new Point(1, 2);
        Point P2= new Point(3, 4);
        Line L1 = new Line();
        L1.setP1(P1);
        L1.setP2(P2); System.out.println("Panjang L1 : " + L1.getLength());
        Line L2 = new Line(5, 6, 7, 8);
        System.out.println("Panjang L2 : " + L2.getLength());
        System.out.println("is greater ? " + L1.isGreater(L1, L2));
        System.out.println("is less ? " + L1.isLess(L1, L2));
        System.out.println("is equal ? " + L1.isEqual(L1, L2));
    }

}
