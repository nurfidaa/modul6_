package ProjectUnguided;

public class SalariedEmployee extends Employee {
    private double upahMingguan;

    public SalariedEmployee(String nama, String nip, double upahMingguan) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    public double hitungGaji() {
        return upahMingguan;
    }
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Upah Mingguan: " + upahMingguan);
    }
}

