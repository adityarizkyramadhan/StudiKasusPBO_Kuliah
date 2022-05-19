package mobil;
public class Bus extends Mobil implements CetakInfoMobil {
    private int jumlahBBM;
    private int jumlahPenumpang;
    
    public Bus(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil, int jumlahBBM, int jumlahPenumpang) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
        this.jumlahBBM = jumlahBBM;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-18s %s\n","Jumlah BBM",":"+ this.jumlahBBM);
        System.out.printf("%-18s %s\n","Jumlah Penumpang",":"+ this.jumlahPenumpang);
    }
}