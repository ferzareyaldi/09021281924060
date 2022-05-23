package nomor5;

public class Trapesium implements Luas{
    private double tinggi;
    private double sisiSejajarA;
    private double sisiSejajarB;

    public Trapesium() {
        tinggi = 0;
        sisiSejajarA =0;
        sisiSejajarB = 0;
    }

    public Trapesium(double tinggi, double sisiSejajarA, double sisiSejajarB) {
        this.tinggi = tinggi;
        this.sisiSejajarA = sisiSejajarA;
        this.sisiSejajarB = sisiSejajarB;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiSejajarA() {
        return sisiSejajarA;
    }

    public void setSisiSejajarA(double sisiSejajarA) {
        this.sisiSejajarA = sisiSejajarA;
    }

    public double getSisiSejajarB() {
        return sisiSejajarB;
    }

    public void setSisiSejajarB(double sisiSejajarB) {
        this.sisiSejajarB = sisiSejajarB;
    }

    @Override
    public double luas() {
        return (sisiSejajarA + sisiSejajarB) * tinggi / 2;
    }
}
