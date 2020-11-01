public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        Segitiga s2 = new Segitiga();
        Segitiga s3 = new Segitiga();
        Segitiga s4 = new Segitiga();
        System.out.println("TOTAL SUDUT 1");
        s.totalSudut(70);
        s.infoSudut();
        System.out.println("TOTAL SUDUT 2");
        s2.totalSudut(7, 5);
        s2.infoSudut();
        System.out.println("KELILING 1");
        s3.keliling(9, 12,13);
        s3.infoSudut();
        System.out.println("KELILING 2");
        s4.keliling(4, 5);
        s4.infoSudut();
    } 
}