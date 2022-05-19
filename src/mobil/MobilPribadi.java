package mobil;

public class MobilPribadi extends Mobil implements CetakInfoMobil {
    private int jumlahKursi;
    public MobilPribadi(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil, int jumlahKursi) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
        this.jumlahKursi = jumlahKursi;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-18s %s\n","Jumlah Kursi",":"+ this.jumlahKursi);
    }
}