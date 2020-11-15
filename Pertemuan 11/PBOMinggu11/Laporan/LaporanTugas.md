# Laporan Tugas Pertemuan 11

## Source Code Binatang

--Source Code--

	public abstract class Binatang {

    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getKaki() {
        return jmlKaki;
    }

    public abstract void displayBinatang();
	}

--Screenshot Code--
<img src = "Binatang.png">

## Source Code IKarnivora

--Source Code--

	public interface IKarnivora {

    void displayMakan();
}

--Screenshot Code--
<img src="IKarnivora.png">

## Source Code IHerbivora

--Source Code--

public interface IHerbivora {

    void displayMakan();
}

--Screenshot Code--
<img src="IHerbivora.png">

## Source Code Singa

--Source Code--

public class Singa extends Binatang implements IKarnivora {

    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan     : " + "Daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis       : " + "Karnivora");
    }
    
    public void displayData(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
        System.out.println("Suara       : " + this.suara);
        System.out.println("Warna Bulu  : " + this.warnaBulu);
    }
}

--Screenshot Code--
<img src="Singa.png">

## Source Code Keledai

--Source Code--

public class Keledai extends Binatang implements IHerbivora {

    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan     : " + "Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis       : " + "Karnivora");
    }
    
    public void displayData(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
        System.out.println("Suara       : " + this.suara);
        System.out.println("Warna Bulu  : " + this.warnaBulu);
    }

}

--Screenshot Code--
<img src="Keledai.png">

## Source Code Gorilla

--Source Code--

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan     : " + "Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis       : " +  "Karnivora + Herbivora");
    }
    
    public void displayData(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
        System.out.println("Suara       : " + this.suara);
        System.out.println("Warna Bulu  : " + this.warnaBulu);
    }

}

--Screenshot Code--

<img src="Gorilla.png">

## Source Code Main

--Source Code--

public class Main {
    public static void main(String[] args) {
        Singa s = new Singa("CingaCing", 4 , "Roaar Roaaar", "Coklat");
        Keledai k = new Keledai("Kedelai", 4, "Hehehehe", "Abu-abu");
        Gorilla g = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        
        k.displayBinatang();
        k.displayMakan();
        k.displayData();
        System.out.println();
        
        g.displayBinatang();
        g.displayMakan();
        g.displayData();
        System.out.println();
        
        s.displayBinatang();
        s.displayMakan();
        s.displayData();
        System.out.println();
    }
}

--Screenshot Code--

<img src="Main.png">

## Penjelasan Code Program

Di dalam code program di atas meiliki 3 class child yaitu Singa, Keledai, dan Gorilla yang mengextends abstrak class Binatang yang berarti class Binatang adalah class parent. Di dalam tiga class child ini memiliki konstruktor berparameter.

Di dalam Class Binatang sendiri memiliki beratribut nama dan jumlah kaki serta memiliki method setter, getter atribut dan method abstrak displayBinatang(). 

kemudian terdapat class interface IKarnivora yang bermethod (abstrak) displayMakanan() diimplementasikan class Singa dan Gorilla.

dan terakhir terdapat class interface IKHerbivora yang bermethod (abstrak) displayMakanan() diimplementasikan class Keledai dan Gorilla.

jadi Gorilla mengimplementasi 2 class interface yaitu, IKarnivora dan Iherbivora. 