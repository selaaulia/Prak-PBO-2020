Nama        : Moch Farchan agil
NIM         : 1941720204
kelas/absen : TI-2C/12
# Jawaban Pertanyaan Jobsheet 3

## 3.3 Pertanyaan
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa
muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?

jawaban: karena pada method tambahKecepatan terdapat perintah jika kontakOn = false artinya mesin mati dan kecepatannya 0 sehingga tidak bisa menambah kecepatan.

2. Mengapat atribut kecepatan dan kontakOn diset private?

jawaban: agar hanya dapat diakses di dalam class saja

3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

source code Motor :
<img src = 'motor.png'>

source code MotorDemo:
<img src = 'motordemo.png'>

output:
<img src = 'outmotor.png'>

## 3.6 Pertanyaan – Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?

jawaban: Getter adalah public method dan memiliki tipe
data return, yang berfungsi untuk mendapatkan
nilai dari atribut private, sedangkan Setter adalah public method yang tidak memiliki
tipe data return, yang berfungsi untuk
memanipulasi nilai dari atribut private.


2. Apa kegunaan dari method getSimpanan()?

jawaban: digunakan untuk mendapatkan nilai dari atribut private float simpanan.

3. Method apa yang digunakan untk menambah saldo?

jawaban: method setor

4. Apa yand dimaksud konstruktor?

jawaban: konstruktor adalah yang dieksekusi ketika instan dari objek dibuat dan cara deklarasinya mirip dengan method

5. Sebutkan aturan dalam membuat konstruktor?
jawaban :
1. Nama konstruktor harus sama dengan nama class
2. Konstruktor tidak memiliki tipe data return
3. Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan syncronized

6. Apakah boleh konstruktor bertipe private?

jawaban : boleh

7. Kapan menggunakan parameter dengan passsing parameter?

jawaban : ketika setter

8. Apa perbedaan atribut class dan instansiasi atribut?

jawaban : Atribut Class adalah Variabel yang ada di dalam class diluar method dan bertipe static, sedangkan Instansiasi atribut adalah atribut yang ada di dalam kelas. akan tetapi diluar method.

9. Apa perbedaan class method dan instansiasi method? 

jawaban : Method Class adalah Kumpulan statemen untuk melakukan proses tertentu dan bertipe static, sedangkan Instansiasi method adalah Objek dari class harus diinstansiasi untuk mengakses method. 
