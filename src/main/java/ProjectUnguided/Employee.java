package ProjectUnguided;

public abstract class Employee {
    protected String nama;
    protected String nip;

    public Employee(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public abstract double hitungGaji();
    public abstract void tampilkanInformasi();
}
