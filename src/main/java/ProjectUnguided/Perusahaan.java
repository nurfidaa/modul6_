package ProjectUnguided;

public class Perusahaan {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("John", "12345", 1000);
        employees[1] = new CommissionEmployee("Alice", "67890", 2000, 0.1, 50000);
        employees[2] = new ProjectPlanner("Bob", "54321", 2500, 0.2, 100000);

        for (Employee employee : employees) {
            System.out.println("Informasi Pegawai:");
            employee.tampilkanInformasi();
            System.out.println("Gaji Pegawai: " + employee.hitungGaji());
            System.out.println();
        }
    }
}
