package mobil;

public class Mobil{
    
    private String noPlat;
    private String nmerkMobil;
    private String kecepatan;
    private String warna;
    private String tahun;

    public String getNmerkMobil() {
        return nmerkMobil;
    }

    public Mobil() {
    }

    public Mobil(String noPlat, String nmerkMobil, String kecepatan, String warna, String tahun) {
        this.noPlat = noPlat;
        this.nmerkMobil = nmerkMobil;
        this.kecepatan = kecepatan;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void cetakInfo() {
        System.out.printf("%-15s %s\n","No. Plat",":"+ noPlat);
        System.out.printf("%-15s %s\n","Merk Mobil",":"+ nmerkMobil);
        System.out.printf("%-15s %s\n","Kecepatan",":"+ kecepatan);
        System.out.printf("%-15s %s\n","Warna",":"+ warna);
        System.out.printf("%-15s %s\n","Tahun",":" + tahun);
    }

    public void mobilMelanggarPeraturan(){
        System.out.println("Mobil " + nmerkMobil + " melanggar peraturan");
    }

    public void mobilRem(){
        System.out.println("Mobil "+ this.nmerkMobil +" melakukan pengereman");
    }

    public void mobilBerhenti(){
        System.out.println("Mobil"+ nmerkMobil+ "berhenti");
    }
    public void mobilBelok(String kemana){
        System.out.println("Mobil"+ nmerkMobil+ "belok ke-" + kemana);
    }

}
