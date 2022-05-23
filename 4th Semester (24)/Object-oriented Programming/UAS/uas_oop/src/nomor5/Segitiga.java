package nomor5;

public class Segitiga implements Luas {
    private double alas;
    private double tinggi;

    public Segitiga() {
        alas = 0;
        tinggi = 0;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return alas * tinggi / 2;
    }
}
