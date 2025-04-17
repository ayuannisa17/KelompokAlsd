package cskelompok;

public class Mahasiswa {
    String NIM;
    String Nama;
    String Prodi;

    Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.Prodi = prodi;
    }
    void TampilMahasiswa() {
        System.out.println("Nim: " + NIM + "Nama: " + Nama + "Prodi: " + Prodi);
    }
}

