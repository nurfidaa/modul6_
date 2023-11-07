package ProjectUnguided;

public class CommissionEmployee extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalPenjualan;

    public CommissionEmployee(String nama, String nip, double gajiPokok, double komisi, double totalPenjualan) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    public double hitungGaji() {
        return gajiPokok + (komisi * totalPenjualan);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Penjualan: " + totalPenjualan);
    }
}
