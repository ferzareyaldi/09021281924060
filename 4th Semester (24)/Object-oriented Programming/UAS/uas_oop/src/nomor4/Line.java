package nomor4;

public class Line extends Point implements Relation{
    Point P1;
    Point P2;
    public Line() {
        // Membentuk sebuah garis dari 2 buah titik dengan nilai x dan y dari setiap titik adalah 0
        System.out.println("Make nomor4.Line");
        //(1)......................................
        P1 = new Point(0,0);
        P2 = new Point(0,0);
    }
    public Line(int x1, int x2, int y1, int y2){
        // Membentuk sebuah garis dari 2 buah titik
        // Nilai titik P1 dibentuk dari x1 dan y1
        // Nilai titik P2 dibentuk dari x2 dan y2
        System.out.println("Make nomor4.Line");
        //(2)......................................
        P1 = new Point(x1,y1);
        P2 = new Point(x2,y2);
    }
    public Point getP1() {
        //getter P1
        //(3)......................................
        return P1;
    }
    public void setP1(Point P1) {
        // Setter P1
        //(4)......................................
        this.P1 = P1;
    }
    public Point getP2() {
        //getter P2
        //(5)......................................
        return P2;
    }
    public void setP2(Point P2) {
        //setter P2
        //(6)......................................
        this.P2 = P2;
    }
    public double getLength(){
        // Menghitung panjang dan mengembalikan nilai panjang tersebut dari sebuah garis dengan rumus
        // akar dari (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)
        System.out.println("Counting Length");
        //(7)......................................
        return Math.sqrt((P2.getX()-P1.getX())*(P2.getX()- P1.getX()) + (P2.getY()- P1.getY())*(P2.getY()- P1.getY()));
    }
    @Override
    public boolean isGreater(Line a, Line b){
        // Mengembalikan true jika
        // Panjang garis a > dari panjang garis b
        System.out.println("Is Greater");
        //(8)......................................
        return a.getLength() > b.getLength();
    }
    @Override
    public boolean isLess( Line a, Line b){
        // Mengembalikan true jika
        // Panjang garis a < dari panjang garis b
        System.out.println("Is Less");
        //(9)......................................
        return a.getLength() < b.getLength();
    }
    @Override
    public boolean isEqual( Line a, Line b)
    {
        // Mengembalikan true jika
        // Panjang garis a = dari panjang garis b
        System.out.println("Is Equal");
        //(10)......................................
        return a.getLength() == b.getLength();
    }
}

