package mobil;

public enum Jurusan {
    SURABAYA("Surabaya - Malang"),
    MADURA("Madura - Malang"),
    BANYUWANGI("Banyuwangi - Malang"),
    SITUBONDO("Situbondo - Malang"),
    TULUNGAGUNG("Tulungagung - Malang");

    private String description;

    Jurusan(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}