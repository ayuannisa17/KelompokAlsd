package kelompokcs;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa() {
        System.out.println("nama: " + nama + "nim: " + nim + "prodi: " + prodi);
    }
}
