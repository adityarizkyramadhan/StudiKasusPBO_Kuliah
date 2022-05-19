package karyawan;

import mobil.Mobil;

public class SupirRentCar extends Karyawan implements CetakInfoKaryawan{
    private Mobil mobilSewa;

    public SupirRentCar(String nama, String alamat, String noTelp, String jenisKelamin){
        super(nama, alamat, noTelp, jenisKelamin);
    }
    public void setMobilSewa(Mobil mobilSewa) {
        this.mobilSewa = mobilSewa;
    }
    public Mobil getMobilSewa() {
        return mobilSewa;
    }
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kendaraan yang disewa :");
        mobilSewa.cetakInfo();
    }
}
