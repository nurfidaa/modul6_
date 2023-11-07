package ProjectUnguided;

public class ProjectPlanner extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalHasilProyek;

    public ProjectPlanner(String nama, String nip, double gajiPokok, double komisi, double totalHasilProyek) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }
    public double hitungGaji() {
        double pajak = 0.05 * gajiPokok;
        return gajiPokok + (komisi * totalHasilProyek) - pajak;
    }
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Hasil Proyek: " + totalHasilProyek);
    }
}
