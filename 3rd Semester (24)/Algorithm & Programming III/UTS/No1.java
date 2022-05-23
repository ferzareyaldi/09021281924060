class Dosen{
    private String nama;
    private int umur;

    public Dosen(){
        this.nama = "-";
        this.umur = 0;
    }
    public Dosen(String nama, int umur) {
        this.nama = nama;
        if (umur >= 0 && umur <= 100)
            this.umur = umur;
        else
            this.umur = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0 && umur <= 100)
            this.umur = umur;
        else
            this.umur = 0;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama +"\nUmur: " + this.umur;
    }
}
public class No1 {
    public static void main(String[] args) {
        Dosen ferza = new Dosen("Ferza Reyaldi", 119);
        System.out.println(ferza);
    }
}
