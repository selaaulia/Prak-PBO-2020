public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 4;
        mSegitiga.tinggi = 9;

        bangunDatar.luas();
        bangunDatar.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
