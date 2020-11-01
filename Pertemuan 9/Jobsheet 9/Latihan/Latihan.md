# Jawaban Pertanyaan Soal Latihan

public class PerkalianKu {

    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

4.1 Dari source coding diatas terletak dimanakah overloading?

jawaban: overloading adalah 2 method bernama perkalian yang berisikan 2 dan 3 variabel parameter.

4.2 Jika terdapat overloading ada berapa jumlah parameter yang berbeda?

jawaban: ada 1 yaitu int c yang berbeda.

public class PerkalianKu {

    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}

4.3 Dari source coding diatas terletak dimanakah overloading?

jawaban: overloading adalah 2 method bertipe void dengan nama perkalian yang berparameter tipe data int dan parameter yang bertipe data double.

4.4 Jika terdapat overloading ada berapa tipe parameter yang berbeda?

jawaban: ada dua yaitu satu dengan variabel int, sedangkan satunya dengan variabel double.

public class Ikan {

    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan {

    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

class Fish {

    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}

4.5 Dari source coding diatas terletak dimanakah overriding?

jawaban: dari source code diatas overridingnya terletak pada method swim yang berada di subclass Piranha

4.6 Jabarkanlah apabila sourcoding diatas jika terdapat overriding?

jawaban: deklarasi method pada subclass sama dengan yang terdapat pada superclass dan memiliki nama method yang sama dengan method yang terdapat dalam superclass.