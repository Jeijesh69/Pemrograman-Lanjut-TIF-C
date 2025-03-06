package BAB_1_CLASS_DAN_OBJECT;

public class MainMobil {
    public static void main(String[] args) {
        // Instan objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();

        System.out.println("================");

        // Instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.displayMessage();

        System.out.println("================");

        // Merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 diubah menjadi warna hijau");
        m1.setWarna("Hijau");

        // Menampilkan hasil perubahan
        m1.displayMessage();
    }
}
