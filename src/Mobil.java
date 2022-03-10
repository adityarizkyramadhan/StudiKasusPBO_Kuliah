public class Mobil {
    //attribute
    private String noPlat;
    private String nmerkMobil;
    private String kecepatan;
    private String warna;
    private String tahun;
    //setter & getter
    // public String getTahun() {
    //     return tahun;
    // }
    // public String getWarna() {
    //     return warna;
    // }
    // public void setWarna(String warna) {
    //     this.warna = warna;
    // }
    // public String getNoPlat() {
    //     return noPlat;
    // }
    // public void setNoPlat(String noPlat) {
    //     this.noPlat = noPlat;
    // }
    public String getNmerkMobil() {
        return nmerkMobil;
    }
    // public void setNmerkMobil(String nmerkMobil) {
    //     this.nmerkMobil = nmerkMobil;
    // }
    // public String getKecepatan() {
    //     return kecepatan;
    // }
    // public void setKecepatan(String kecepatan) {
    //     this.kecepatan = kecepatan;
    // }
    // public void setTahun(String tahun) {
    //     this.tahun = tahun;
    // }

    //constructor
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
