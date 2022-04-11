import java.util.Scanner;
import mobil.*;
import karyawan.*;

public class App {
    public static void main(String[] args) throws Exception {
        Mobil innova = new Mobil ("B 12345", "Innova", "120km/jam", "Hitam", "2018");
        Mobil alphard = new Mobil ("B 67890", "Alphard", "125km/jam", "Merah", "2018");
        Mobil bugatti = new Mobil ("N 6969", "Bugatti", "250km/jam", "Silver", "2015");
        Mobil RollsRoyce = new Mobil ("KONOHA 1", "Rolls Royce", "250km/jam", "Gold", "2015");
        Mobil porsche = new Mobil ("W 1453", "Porsche", "130km/jam", "Biru", "2016");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Karyawan : ");
        int input = s.nextInt();
        Karyawan [] karyawan =  new Karyawan[input];
        System.out.println("""
            Posisi Jabatan
                1. Admin
                2. Supir Travel
                3. Supir Supir Car
                """);
        for (int i = 0; i < karyawan.length; i++) {
            System.out.print("Masukkan jenis karyawan: ");
            int statusKaryawan = s.nextInt();
            System.out.print("Masukkan nama\t: ");
            String nama = s.next();
            System.out.print("Masukkan alamat\t: ");
            String alamat = s.next();
            System.out.print("Masukkan No. Telepon\t: ");
            String noTelp = s.next();
            System.out.print("Jenis Kelamin (Laki-laki/Perempuan)\t: ");
            String sex  = s.next();
            if (statusKaryawan == 1){
                Admin newAdmin = new Admin(nama,alamat,noTelp, sex);
                System.out.print("Masukkan tunjangan : ");
                int tunjangan = s.nextInt();
                newAdmin.setTunjangan(tunjangan);
                karyawan[i] = newAdmin;
            } 
            else if (statusKaryawan == 2){
                var newSupirTravel = new SupirTravel(nama,alamat,noTelp, sex);
                try {
                    int count = 0;
                    for(var jurusan : Jurusan.values()){
                        System.out.println(count + jurusan.getDescription());
                        count++;
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }
                int pilTrayek = s.nextInt();
                try {
                    if (pilTrayek == 1){
                        newSupirTravel.setRuteTrayek(Jurusan.SURABAYA.getDescription());
                    } else if (pilTrayek == 2){
                        newSupirTravel.setRuteTrayek(Jurusan.MADURA.getDescription());
                    } else if (pilTrayek == 3){
                        newSupirTravel.setRuteTrayek(Jurusan.BANYUWANGI.getDescription());
                    } else if (pilTrayek == 4){
                        newSupirTravel.setRuteTrayek(Jurusan.SITUBONDO.getDescription());
                    } else if (pilTrayek == 5){
                        newSupirTravel.setRuteTrayek(Jurusan.TULUNGAGUNG.getDescription());
                    }
                    karyawan[i] = newSupirTravel;
                } catch (ArrayIndexOutOfBoundsException exception){
                    System.err.println("PILIHAN TIDAK ADA!!!");
                    System.out.println(exception);
                }
            } 
            else if (statusKaryawan == 3){
                var newSupirRentCar = new SupirRentCar(nama,alamat,noTelp, sex);
                System.out.println("""
                Pilihan Mobil
                    1. Innova
                    2. Alphard
                    3. Bugatti
                    4. Rolls RollsRoyce     
                    5. Porche """);
                int sewaMobil = s.nextInt();
                if (sewaMobil == 1){
                    newSupirRentCar.setMobilSewa(innova);
                } 
                else if (sewaMobil == 2){
                    newSupirRentCar.setMobilSewa(alphard);
                }
                else if (sewaMobil == 3){
                    newSupirRentCar.setMobilSewa(bugatti);
                } 
                else if (sewaMobil == 4){
                    newSupirRentCar.setMobilSewa(RollsRoyce);
                }
                else if (sewaMobil == 5){
                    newSupirRentCar.setMobilSewa(porsche);
                } 
                karyawan[i] = newSupirRentCar;
            }else{
                System.err.println("\n=== PILIH 1-3 ===");
            }
        }
        printKaryawan(karyawan);
        s.close();
    }
    private static void printKaryawan(Karyawan[] karyawan){
        for (int i = 0; i < karyawan.length; i++) {
            System.out.println("\n=== Karyawan ke-" + (i+1) + " ===");
            karyawan[i].cetakInfo();
        }
    }
}    