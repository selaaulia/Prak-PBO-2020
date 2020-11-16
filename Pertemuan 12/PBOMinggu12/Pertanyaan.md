# Jawaban Pertanyaan Jobsheet 12

## Percobaan 1

1. Class apa sajakah yang merupakan turunan dari class Employee?
	Jawab : Yang merupakan class turunan dari Employee adalah Class InternshipEmployee dan PermanentEmployee

2. Class apa sajakah yang implements ke interface Payable?
	Jawab : Class yang merupakan implements ke interface Payable adalah ElectricityBill dan PermanentEmployee

3. Perhatikan class Tester1, baris ke 10 dan 11. Mengapa e, bisa diisi dengan objek pEmp(merupakan objek dari class PermanenEmployee) dan objek iEmp(merupakan onjek dari class IntershipEmployee)?
	Jawab : Pengisian pEmp dan pIMp pada e mungkin bermaksud digunakan untuk memanggil objek yang ada pada class e (Employe) namun dalam class ini tidak bisa digunakan sehingga output yang keluar kosong.

4. Perhatikan class Tester1, baris ke 12 dan 13. Mengapa p, bisa diisi dengan objek pEmp(merupakan objek dari class permanentEmployee) dan onjek eBill (merupakan objek dari class ElectricityBill)?
	Jawab : Pengisian pEmp dan eBill pada p mungkin bermaksud digunakan untuk memanggil objek yang ada pada class p (Payable) namun dalam class ini tidak bisa digunakan sehingga output yang keluar kosong.

5. Coba tambahkan sintaks:
		p = iEmp;
		e = eBill;
	Pada baris 14 dan 15 (baris terakhir dalam method main)! Apa yang menyebabkan error?
	Jawab : Terjadi eror karena pada program tersebut objek yang dituliskan tidak sesuai dengan class yang memuat objek tersebut. Yaitu seperti objek iEmp tidak berada pada class Payable begitupun sebaliknya sehingga objek tidak dapat ditemukan.

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
	Jawab : Kesimpulan tentang konsep atau bentuk dasar dari poilimorfisme adalah suatu program yang digunakan untuk menghasilkan suatu output berbeda dengan cara yang sama. Pemberian obyek dari subclass ke obyek dari superclass dapat dilakukan tanpa perlu melakukan konversi. 


## Percobaan 2

1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
	Jawab : Hal tersebut dikarenakan adanya program seperti berikut ini pada baris ke 6 dan ke-7 : 
		Employee e;
        e = pEmp;
    Pada program tersebut terdeklarasikan bahwa pemanggilan class Employee sama dengan memanggil class PErmanantEmployee. Sehingga hal tersebutlah yang menyebabkan hasildari pemanggilan pada baris 8 dan baris 10 sama.

2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmpoyeeInfo() tidak?
	Jawab : Hal tersebut dikarenakan pada saat pemanggilan method e.getEmployeeInfo() ada deklarasi e = pEmp yang mengartikan bahawa Class Employee sendiri sama dengan class PermanentEmployee sehingga untuk memanggil method e.getEmployeeInfo() sendiri harus melalui class Employe terlebih dahulu kemudian dialihkan pada class PermanentEmployee seperti pada deklarasi yang telah diinputkan.

3. Jadi apakah yang dimaksud dari virtual invocation? Mengapa disebut virtual?
	Jawab : Pemanggilan method melalui class yang bukan merupakan class yang memuat method yang terpanggil dengan mendeklarasikan bahwa class a = class b sehingga kedua class a juga merupakan class b.


## Percobaan 3

1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe berbeda, yaitu objek pEmp(objek dari PermanentEmployee) dan objek iEmp (Objek dari InternshipEmployee)?
	Jawab : array e bisa diisi dengan objek-objek dengan tipe berbeda yaitu objek pEmp dan iEmp dikarenakan class dari objek-objek tersebut yaitu class PermanentEmployee dan InternshipEmployee merupakan class child atau anak dari class Employee sehingga ketiga class tersebut saling terhubung dan terkait.

2. Perhatikan juga baris ke-9, mengapa array p juga bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling)?
	Jawab : array p juga bisa diisi dengan objek-objek dengan tipe yang berbeda seperti pEmp dan eBill dikarenakan class dari objek-objek tersebut yaitu PermanentEmployee dan ElectricityBill merupakan implemets dari class Payable sehingga ketiganya masih terhubung atau saling terkait.

3. Perhatikan baris ke-10, mengapa terjadi error?
	Jawab : Pada baris ke-10 terjadi eror dikarenakan salah satu isi dari array e2 (employee) adalah eBill. Saat eBill sendiri dimasukkan dalam isi array e2 error dikarenakan dari eBill sendiri tidak memiliki keterbaikan atau hubungan dengan class Employee sehingga didalam class employee tidak bisa memangggil eBill tersebut.

## Percobaan 4

1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan mathod pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable. Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
	Jawab : Hal tersebut di dalam class Owner dalam method pay() sudah diidentifikannya objek eBill yang berada pada Class ElecticityBill dan pEmp yang berada pada class PermanentEmployee dan juga Kedua class tersebut juga merupakan implements dari class Payable.

2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
	Jawab : Untuk mengidentifikasikan bahwa tipe dari method tersebut adalah tipe-tipe yang berada pada class Payable ataupun class-class yang berhubungan dengan class tersebut.

3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?
	Jawab : Error tersebut dikarenakan objek IEmp yang dipanggil berada pada class InternshipEmployee yang tidak diidentifikasikan pada method pay()  dan juga class InternshipEmployee sendiri tidak memiliki hubungan/terkait dengan class Playable sehingga tidak bisa ditimbahkan dalam method Pay().

4. Perhatikan class Owner, diperlukan untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan? Mengapa objek p yang bertipe Payable harus dicasting ke dalam objek eb yang bertipe ElecticityBill?
	Jawab : Casting tersebut diperlukan sebagai bentuk pengarahan aksi eksekusi dari kode program yang dipanggil atau juga bisa dengan mengidentifikasikan agar dapat membaca kode program dari class yang dimaksud.