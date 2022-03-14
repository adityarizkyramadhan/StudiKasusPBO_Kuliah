public class SupirTravel extends Karyawan{
    
    SupirTravel(String nama, String alamat, String noTelp, String jenisKelamin){
        // super constructor
        super(nama, alamat, noTelp, jenisKelamin);
    }
    
    private String ruteTrayek;
    
    public void setRuteTrayek(String ruteTrayek){
        this.ruteTrayek = ruteTrayek;
    }
    public String getRuteTrayek(){
        return this.ruteTrayek;
    }

    public void getInfo(){
        super.getInfo();
        System.out.printf("%-18s %s\n","Rute Trayek",":"+ this.ruteTrayek);
    }
}