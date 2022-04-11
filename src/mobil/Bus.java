package mobil;
public class Bus extends Mobil implements CetakInfoMobil {
    public Bus(String nmerkMobil, String jenisMobil, String warnaMobil, String tahunMobil, String hargaMobil) {
        super(nmerkMobil, jenisMobil, warnaMobil, tahunMobil, hargaMobil);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }
}