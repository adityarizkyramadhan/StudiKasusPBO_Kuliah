package karyawan;
public class SupirTravel extends Karyawan implements CetakInfoKaryawan{
    
    public SupirTravel(String nama, String alamat, String noTelp, String jenisKelamin){
        super(nama, alamat, noTelp, jenisKelamin);
    }
    
    private String ruteTrayek;
    
    public void setRuteTrayek(String ruteTrayek){
        this.ruteTrayek = ruteTrayek;
    }
    public String getRuteTrayek(){
        return this.ruteTrayek;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.printf("%-18s %s\n","Rute Trayek",":"+ this.ruteTrayek);
    }
}