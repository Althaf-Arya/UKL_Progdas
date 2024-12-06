package UKL;

public class SoalSedang1 {
     public static void main(String[] args) {
        // Variabel
        int TabunganPertama = 100000;
        int kenaikan = 50000;
        int totalTabungan = 0;

        // Output kehadiran
        for (int bulan = 1; bulan <= 12; bulan++) {
            System.out.println("Tabungan bulan ke-" + bulan + ": Rp" + TabunganPertama);
            totalTabungan += TabunganPertama;
            TabunganPertama += kenaikan;
        }
        
        // Output total
        System.out.println("Total tabungan selama 12 bulan: Rp" + totalTabungan);
    }  
}