package mobil;
public class MiniBus extends Mobil implements CetakInfoMobil {
    public MiniBus(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }

}