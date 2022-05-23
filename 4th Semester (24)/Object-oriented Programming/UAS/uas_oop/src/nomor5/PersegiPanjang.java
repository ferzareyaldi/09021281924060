package nomor5;

public class PersegiPanjang implements Luas{
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}
