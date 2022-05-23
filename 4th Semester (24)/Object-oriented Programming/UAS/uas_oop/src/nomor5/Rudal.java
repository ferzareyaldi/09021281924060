package nomor5;

public class Rudal implements Luas{
    private final Segitiga segitiga;
    private final PersegiPanjang persegiPanjang;
    private final Trapesium trapesium;

    public Rudal(double sisiSejajarB, double sisiSejajarA, double tinggiTrapesium, double panjang, double tinggiSegitiga) {
        this.segitiga = new Segitiga(sisiSejajarA, tinggiSegitiga);
        this.persegiPanjang = new PersegiPanjang(sisiSejajarA, panjang);
        this.trapesium = new Trapesium(tinggiTrapesium, sisiSejajarA, sisiSejajarB);
    }

    @Override
    public double luas() {
        return segitiga.luas() + persegiPanjang.luas() + trapesium.luas();
    }
}
