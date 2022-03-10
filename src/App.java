import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mobil yang diinginkan: ");
        int jumlahMobil = input.nextInt();
        Mobil [] mobils = new Mobil[jumlahMobil];
        inputMobil(mobils);
        System.out.print("Jumlah pegawai : ");
        int jumlahPegawai = input.nextInt();
        Karyawan [] karyawans = new Karyawan[jumlahPegawai];
        inputKaryawan(karyawans);
        System.out.println("\n=== Test Behaviour ===");
        mobils[0].mobilRem();
        mobils[0].mobilMelanggarPeraturan();
        karyawans[0].setMobil(mobils[0]);
        karyawans[0].pengemudiDitilang();
    }
    // Method
    public static void inputMobil(Mobil [] mobils) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < mobils.length; i++) {
            System.out.println("Mobil ke-" + (i+1));
            System.out.print("No. Plat : ");
            String noPlat = input.nextLine();
            System.out.print("Nama Mobil : ");
            String nmerkMobil = input.nextLine();
            System.out.print("Kecepatan : ");
            String kecepatan = input.nextLine();
            System.out.print("Warna :");
            String warna = input.nextLine();
            System.out.print("Tahun : ");
            String tahun = input.nextLine();
            mobils[i] = new Mobil(noPlat, nmerkMobil, kecepatan, warna, tahun);
        }
        for(var mobil : mobils){
            mobil.cetakInfo();
        }
    }

    public static void inputKaryawan (Karyawan [] karyawans) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < karyawans.length; i++) {
            //input karyawan
            System.out.println("Karyawan ke-" + (i+1));
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Alamat : ");
            String alamat = input.nextLine();
            System.out.print("No. Telepon : ");
            String noHp = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = input.nextLine();
            System.out.print("Jenis karyawan : ");
            String jenisKaryawan = input.nextLine();
            karyawans[i] = new Karyawan(nama, alamat, noHp, jenisKelamin, jenisKaryawan);
        }
        for(var karyawan : karyawans){
            karyawan.cetakInfo();
        }
    }
}

