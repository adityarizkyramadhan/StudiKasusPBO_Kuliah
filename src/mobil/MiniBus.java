package mobil;
public class MiniBus extends Mobil implements CetakInfoMobil {
    private int jumlahBagasi;
    public MiniBus(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil, int jumlahBagasi) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
        this.jumlahBagasi = jumlahBagasi;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-18s %s\n","Jumlah Bagasi",":"+ this.jumlahBagasi);
    }

}