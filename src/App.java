import java.util.Scanner;

public class App {
    // static Scanner input = new Scanner(System.in);
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
                1. Admin
                2. Supir Travel
                3. Supir Supir Car
                """);
        for (int i = 0; i < karyawan.length; i++) {
            System.out.print("Masukkan jenis karyawan: ");
            int statusKaryawan = s.nextInt();
            System.out.print("\nMasukkan nama\t: ");
            String nama = s.next();
            System.out.print("\nMasukkan alamat\t: ");
            String alamat = s.next();
            System.out.print("\nMasukkan No. Telepon\t: ");
            String noTelp = s.next();
            System.out.print("\nJenis Kelamin (Laki-laki/Perempuan)\t: ");
            String sex  = s.next();
            
            if (statusKaryawan == 1){
                var newAdmin = new Admin(nama,alamat,noTelp, sex);
                System.out.print("Masukkan tunjangan : ");
                int tunjangan = s.nextInt();
                newAdmin.setTunjangan(tunjangan);
                newAdmin.getInfo();
                karyawan[i] = newAdmin;
            } 
            else if (statusKaryawan == 2){
                var newSupirTravel = new SupirTravel(nama,alamat,noTelp, sex);
                newSupirTravel.setRuteTrayek("");
                newSupirTravel.getInfo();
                karyawan[i] = newSupirTravel;
            } 
            else if (statusKaryawan == 3){
                var newSupirRentCar = new SupirRentCar(nama,alamat,noTelp, sex);
                System.out.println("""
                    Pilihan Mobil
                        1. Innova
                        2. Alphard
                        3. Bugatti
                        4. Rolls RollsRoyce
                        5. Porche
                        """);
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
                newSupirRentCar.getInfo();
                karyawan[i] = newSupirRentCar;
            }else{
                System.err.println("\n=== PILIH 1-3 ===");
            }
        }
    }
}    
    // Method
    // public static void inputMobil(Mobil [] mobils) {
    //     for(int i = 0; i < mobils.length; i++) {
    //         System.out.println("Mobil ke-" + (i+1));
    //         System.out.print("No. Plat : ");
    //         String noPlat = input.nextLine();
    //         System.out.print("Nama Mobil : ");
    //         String nmerkMobil = input.nextLine();
    //         System.out.print("Kecepatan : ");
    //         String kecepatan = input.nextLine();
    //         System.out.print("Warna :");
    //         String warna = input.nextLine();
    //         System.out.print("Tahun : ");
    //         String tahun = input.nextLine();
    //         mobils[i] = new Mobil(noPlat, nmerkMobil, kecepatan, warna, tahun);
    //     }
    //     for(var mobil : mobils){
    //         mobil.cetakInfo();
    //     }
    // }

    // public static void inputKaryawan (Karyawan [] karyawans) {
    //     for(int i = 0; i < karyawans.length; i++) {
    //         //input karyawan
    //         System.out.println("Karyawan ke-" + (i+1));
    //         System.out.print("Nama : ");
    //         String nama = input.nextLine();
    //         System.out.print("Alamat : ");
    //         String alamat = input.nextLine();
    //         System.out.print("No. Telepon : ");
    //         String noHp = input.nextLine();
    //         System.out.print("Jenis Kelamin : ");
    //         String jenisKelamin = input.nextLine();
    //         System.out.print("Jenis karyawan : ");
    //         String jenisKaryawan = input.nextLine();
    //         karyawans[i] = new Karyawan(nama, alamat, noHp, jenisKelamin, jenisKaryawan);
    //     }
    //     for(var karyawan : karyawans){
    //         karyawan.getInfo();
    //     }
    // }
    // public void getInfoKaryawan(Karyawan K){
    //     if (K instanceof Admin){
            
    //     } 
    //     else if (K instanceof SupirTravel){
            
    //     } 
    //     else if (K instanceof SupirRental){
    //     }
    // }


