public class SupirRentCar extends Karyawan{
    private Mobil mobilSewa;

    SupirRentCar(String nama, String alamat, String noTelp, String jenisKelamin){
        super(nama, alamat, noTelp, jenisKelamin);
    }
    public void setMobilSewa(Mobil mobilSewa) {
        this.mobilSewa = mobilSewa;
    }
    public Mobil getMobilSewa() {
        return mobilSewa;
    }

    public void getInfo(){
        super.getInfo();
        System.out.printf("%-18s %s\n","Mobil yang disewa",":"+ this.mobilSewa);
    }
}
