public class Karyawan {
    private String nama;
    private String alamat;
    private String noTelp;
    private String jenisKelamin;
    private Mobil mobil;
    public Karyawan(){

    }
    public Karyawan(String nama, String alamat, String noTelp, String jenisKelamin){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
    }

    // Behaviour
    public void setMobil(Mobil mobil){
        System.out.println(this.nama + " menggunakan mobil " + mobil.getNmerkMobil());
        this.mobil= mobil;
    }
    public void pengemudiDitilang(){
        System.out.println(this.nama + " menggunakan " + this.mobil.getNmerkMobil() + " tidak sesuai dengan standar");
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public void getInfoKaryawan(Karyawan K){
        if (K instanceof Admin){
            K.getInfo();
        }
        else if (K instanceof SupirTravel){
            K.getInfo();
        }
        else if (K instanceof SupirRentCar){
            K.getInfo();
        }
    }

    public void getInfo(){
        System.out.printf("%-18s %s\n","Nama",":"+ this.nama);
        System.out.printf("%-18s %s\n","Alamat",":"+ this.alamat);
        System.out.printf("%-18s %s\n","No. Telepon",":"+ this.noTelp);
        System.out.printf("%-18s %s\n","Jenis Kelamin",":"+ this.jenisKelamin);
        
    }
}



