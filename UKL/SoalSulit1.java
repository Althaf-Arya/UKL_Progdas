package UKL;

import java.util.Scanner;

public class SoalSulit1 {
    public static void main(String[] args) {
    Scanner hooh = new Scanner(System.in);

        // Jumlah siswa 
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = hooh.nextInt();

        int[] hariHadir = new int[jumlahSiswa];
        int totalKehadiran = 0;   

        // Memasukkan jumlah hari hadir
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke- " + (i+1) + ": ");
            hariHadir[i] = hooh.nextInt();
            totalKehadiran += hariHadir[i];
        }

        System.out.println("--------------------------------------------------------------------");

        // Rumus rata-rata kehadiran
        double rataRataKehadiran = (double) totalKehadiran / jumlahSiswa;

        // Output kehadiran
        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari kerja: 24 Hari):  ");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke- " + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }
        
        System.out.println();

        // Output rata-rata
        System.out.println("Rata-rata kehadiran siswa: " + rataRataKehadiran + " hari");
        System.out.println();

        // Kesimpulan
        System.out.println("Kesimpulan:");
        System.out.println("Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRataKehadiran) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRataKehadiran) {
                System.out.println("- Siswa ke-" + (i + 1) + " ("+ hariHadir[i] +" hari)");
            }
        }
    
}

}    