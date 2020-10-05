# Jawaban Pertemuan 6

## Percobaan 1
1. Terjadi eror, karena tidak ada extends ClassA pada ClassB.
Source code yang telah dirubah pada ClassB:
public class ClassB extends ClassA{

    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}
2. Terjadi keroran program karena sebelumnya belum ditambahkan kode extends ClassA pada ClassB untuk mengambil data yang ada pada ClaasA, sehingga data yang ada pada classB tidak bisa teridentifikasi.

## Percobaan 2
1. Terjadi error program, untuk perbaikan berikut ini:
A. Source Code pada ClassA:
public class ClassA {

    public int x;
    public int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x : " + x);
        System.out.println("nilai y : " + y);
    }
}
B. Source Code ClassB:
public class ClassB extends ClassA {

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}
2. Terdapat eror didalam 2 class yang akan saya jelaskan seperti berikut ini:
A. Pada ClassA terjadi error karena tipe modifiernya adalah private sehingga tidak bisa terbaca pada ClassB
B. Belum ditambahkan extends ClassA sehingga data yang ada pada ClassA belum tertambahkan ke dalam ClassB

## Percobaan 3
1. Fungsi dari super yang berapa pada super.phi dan super.r adalah untuk mengisi variabel yang ada diluar class. Karena variabel phi dan r berada pada Bangun dan baru diisi didalam Tabung sehingga kita perlu menggunkan super untuk mengisi variabel phi dan r yang berada diluar Tabung. 
2. Fungsi "super" dan "this" pada method volume adalah sama sama memanggil variabel, tetapi "super" untuk memanggil variabel yang berada diluar class sedangkan untuk "this" memanggil variabel yang ada di dalam class.
3. Pada Class Tabung tidak dideklarasikan "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut dikarenakan penggunan "super" pada atribut mereka. Karena fungsi "super" sendiri adalah mengisi variabel yang ada diluar class. Serta ditambahkannya extends Bangun yang digunakan sebagai jembatan atau penghubung dari Bangun dan Tabung sehingga atributnya juga dapat dideklarasi pada class Tabung.

##Percobaan 4
1. 	- superclass adalah ClassA
	- subclass adalah ClassB dan ClassC
	Hal tersebut dikarenakan ClassB dan ClassC maarupakan turunan atau mendapatkan warisan dari ClassA.
2. Tidak ada perubahan dari hasil outputnya, tetap sama dengan sebelumnya.
3. Terjadi eror apabila "super();" dituliskan setelah konstruktor dikarenakan objek akan mengeksekusi di konstruktor parentclass karena ClassC merupakan turunan dari ClassB dan ClassB adalah turunan dari ClassA.
4. Fungsi dari "super();" adalah agar dapat merujuk ke konstruktor parentclass.