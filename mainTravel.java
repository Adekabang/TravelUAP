import java.util.Scanner;
public class mainTravel {
    public static void main(String[] args) {
        int pilihan = 0;
        int jam;
        int km;
        
        Scanner in = new Scanner(System.in);
        sport siMerah = new sport("14045", "B 123 Q", "Surdi Wirayanto K.", 3);
        suv siHitam = new suv("14055", "N 456 X", "Fahlan Wirayanto M.", 7);
        offroad siHijau = new offroad("14065", "BK 890 Z", "Dwi Wirayanto F.", 5);
        
        
        do {
        System.out.println("KATALOG TRAVEL MALANG");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Harga Sewa Awal : Rp100000");
        System.out.println("1. Mobil Sport");
        System.out.println("2. Mobil SUV");
        System.out.println("3. Mobil Offroad");
        System.out.print("Masukkan Pilihan : ");
        pilihan = in.nextInt();
        System.out.println("=====================");
        
        
        switch(pilihan){
            
            case 1 :
                System.out.println("Mobil Sport");
                siMerah.displayData();
                System.out.println("Mobil Sport memiliki kemampuan untuk Balapan, harga sewa akan naik 20%");
                
                System.out.print("Lama Penyewaan (jam) : ");
                jam = in.nextInt();
                System.out.print("Jarak yang Akan ditempuh (km): ");
                km = in.nextInt();
                siMerah.addTotalJarakTempuh(km);
                System.out.println("Total Pembayaran ");
                System.out.println("Harga Sewa Awal : Rp" +siMerah.hargaSewaAwal());
                System.out.println("Harga Sewa Per Jam : Rp" +siMerah.hargaSewaPerJam()+ "x" +jam);
                System.out.println("Total : Rp" +(siMerah.hargaSewaAwal()+(siMerah.hargaSewaPerJam()*jam)));
                System.out.println("");
                break;
                
            case 2 :
                System.out.println("Mobil SUV");
                siHitam.displayData();
                
                System.out.print("Lama Penyewaan (jam) : ");
                jam = in.nextInt();
                System.out.print("Jarak yang Akan ditempuh (km): ");
                km = in.nextInt();
                siHitam.addTotalJarakTempuh(km);
                System.out.println("Total Pembayaran ");
                System.out.println("Harga Sewa Awal : Rp" +siHitam.hargaSewaAwal());
                System.out.println("Harga Sewa Per Jam : Rp" +siHitam.hargaSewaPerJam()+ "x" +jam);
                System.out.println("Total : Rp" +(siHitam.hargaSewaAwal()+(siHitam.hargaSewaPerJam()*jam)));
                System.out.println("");
                break;
                
            case 3:
                System.out.println("Mobil Offroad");
                siHijau.displayData();
                System.out.println("Mobil Offroad memiliki kemampuan untuk Eksplorasi Hutan, harga sewa akan naik 15%");
                
                System.out.print("Lama Penyewaan (jam) : ");
                jam = in.nextInt();
                System.out.print("Jarak yang Akan ditempuh (km): ");
                km = in.nextInt();
                siHijau.addTotalJarakTempuh(km);
                System.out.println("Total Pembayaran ");
                System.out.println("Harga Sewa Awal : Rp" +siHijau.hargaSewaAwal());
                System.out.println("Harga Sewa Per Jam : Rp" +siHijau.hargaSewaPerJam()+ "x" +jam);
                System.out.println("Total : Rp" +(siHijau.hargaSewaAwal()+(siHijau.hargaSewaPerJam()*jam)));
                System.out.println("");
                break;
             
        }
        } while (pilihan != 0);
    }
}
