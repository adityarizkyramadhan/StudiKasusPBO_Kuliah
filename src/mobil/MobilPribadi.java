package mobil;

public class MobilPribadi extends Mobil implements CetakInfoMobil {
    public MobilPribadi(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }
}