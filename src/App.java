import java.util.Scanner;
import mobil.*;
import garasi.*;
import kantor.*;
import karyawan.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Input mobil and save in garasi
        Garasi garasi = new Garasi();
        System.out.println("WELCOME TO SISTEM INFORMASI FILKOM TOUR");
        System.out.println("=======================================");
        // input nobil with scanner
        System.out.print("Jumlah mobil yang ingin dibeli: ");
        int jumlahMobil = s.nextInt();s.nextLine();
        for (int i = 0; i < jumlahMobil;i++ ){
            System.out.println("""
                Pilihan Mobil
                    1. Bus
                    2. Mobil Pribadi
                    3. Mini Bus
                    """);
            System.out.print("Input jenis kendaraan : ");
            int pilihanMobil = s.nextInt();s.nextLine();
            System.out.print("Input merk kendaraan : ");
            String nmerkMobil = s.nextLine();
            System.out.print("Input plat kendaraan : ");
            String platMobil = s.nextLine();
            System.out.print("Input warna kendaraan : ");
            String warnaMobil = s.nextLine();
            System.out.print("Input tahun kendaraan : ");
            String tahunMobil = s.nextLine();
            System.out.print("Input harga kendaraan : ");
            String hargaMobil = s.nextLine();
            // input mobil case
            switch (pilihanMobil) {
                case 1:
                    System.out.print("Input jumlah bbm : ");
                    int jumlahBBM = s.nextInt();s.nextLine();
                    System.out.print("Input jumlah penumpang : ");
                    int jumlahPenumpang = s.nextInt();s.nextLine();
                    // input mobil
                    Bus bus = new Bus(platMobil, nmerkMobil, warnaMobil, tahunMobil, hargaMobil, jumlahBBM, jumlahPenumpang);
                    // add mobil to garasi
                    garasi.masukkanMobil(bus);
                    break;
                case 2:
                    System.out.print("Input jumlah kursi : ");
                    int jumlahKursi = s.nextInt();s.nextLine();
                    // input mobil
                    MobilPribadi mobilPribadi = new MobilPribadi(platMobil, nmerkMobil, warnaMobil, tahunMobil, hargaMobil, jumlahKursi);
                    // add mobil to garasi
                    garasi.masukkanMobil(mobilPribadi);
                    break;
                case 3:
                    System.out.print("Input jumlah bagasi : ");
                    int jumlahBagasi = s.nextInt();s.nextLine();
                    MiniBus miniBus = new MiniBus(platMobil, nmerkMobil, warnaMobil, tahunMobil, hargaMobil, jumlahBagasi);
                    // add mobil to garasi
                    garasi.masukkanMobil(miniBus);
                    break;
                default:
                    System.out.println("Input salah");
                    break;
            }
        }
        System.out.print("\n\nMasukkan Jumlah Karyawan : ");
        int jumlahKaryawan = s.nextInt();
        Kantor kantorBus = new Kantor();
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("""
            Posisi Jabatan
                1. Admin
                2. Supir Travel
                3. Supir Rent Car
                """);
            System.out.println("---------------- Karyawan ----------------------");
            System.out.print("Masukkan jenis karyawan: ");
            int statusKaryawan = s.nextInt();s.nextLine();
            System.out.print("Masukkan nama\t: ");
            String nama = s.nextLine();
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
                kantorBus.addKaryawan(newAdmin);
            }
            else if (statusKaryawan == 2){
                var newSupirTravel = new SupirTravel(nama,alamat,noTelp, sex);
                try {
                    int count = 0;
                    for(var jurusan : Jurusan.values()){
                        System.out.println((count+1)+ ". " + jurusan.getDescription());
                        count++;
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                }
                System.out.print("Masukkan pilihan trayek : ");
                int pilTrayek = s.nextInt(); s.nextLine();
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
                    kantorBus.addKaryawan(newSupirTravel);
                } catch (ArrayIndexOutOfBoundsException exception){
                    System.err.println("PILIHAN TIDAK ADA!!!");
                }
            }
            else if (statusKaryawan == 3){
                var newSupirRentCar = new SupirRentCar(nama,alamat,noTelp, sex);
                garasi.getInfoGarasi();
                //implementasi stack
                System.out.println("Mobil akan dipilih dari paling baru masuk digarasi");
                var mobilDipakai = garasi.ambilMobil();
                newSupirRentCar.setMobilSewa(mobilDipakai);
                kantorBus.addKaryawan(newSupirRentCar);
            }else{
                System.err.println("\n=== PILIH 1-3 ===");
            }
        }
        System.out.println("\n=== Karyawan yang ada di Kantor ===");
        kantorBus.getInfoKaryawan();
        s.close();
    }
}
