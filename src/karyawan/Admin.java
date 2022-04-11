package karyawan;

public class Admin extends Karyawan implements CetakInfoKaryawan {
    private int tunjangan;

    public Admin(String nama, String alamat, String noTelp, String jenisKelamin) {
        super(nama, alamat, noTelp, jenisKelamin);
    }
    // settter getter 
    public int getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-18s Rp %s\n","Tunjangan",":"+ this.tunjangan);
    }
}


