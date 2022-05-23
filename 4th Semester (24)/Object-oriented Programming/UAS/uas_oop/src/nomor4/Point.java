package nomor4;

interface Relation{
    public boolean isGreater( Line a, Line b);
    public boolean isLess( Line a, Line b);
    public boolean isEqual( Line a, Line b);
}
public class Point {
    protected int x;
    protected int y;
    public Point() {
        System.out.println("Make nomor4.Point");
        this.x=0;
        this.y=0;
    }
    public Point(int x, int y) {
        System.out.println("Make nomor4.Point");
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}