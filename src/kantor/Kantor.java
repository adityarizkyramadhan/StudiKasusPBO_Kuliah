package kantor;

import java.util.LinkedHashMap;
import karyawan.*;


public class Kantor {
    private static LinkedHashMap<Integer, Karyawan> karyawanKantor;
    private static int key;
    public Kantor () {
        karyawanKantor = new LinkedHashMap<>();
        key = 0;
    }
    public void addKaryawan(Karyawan karyawan) {
        karyawanKantor.put(key, karyawan);
        key++;
    }
    public static void removeKaryawan(int key) {
        karyawanKantor.remove(key);
        key--;
    }
    public void getInfoKaryawan(Karyawan karyawan) {
        karyawan.cetakInfo();
    }
    public void getInfoKaryawan() {
        for (Karyawan karyawan : karyawanKantor.values()) {
            karyawan.cetakInfo();
        }
    }
}  