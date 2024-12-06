package UKL;

import java.util.Scanner;

public class SoalMudah2 {
    public static void main(String[] args) {
        Scanner iya = new Scanner(System.in);

        System.out.println("--------Membedakan Bilangan Prima atau Bukan--------");
        
        // Input
        System.out.print("Masukkan bilangan: ");
        int bilangan = iya.nextInt();

        // Rumus bilangan prima (Menggunakan if else)
        if (bilangan % 2 == 0 || bilangan % 3 == 0) {
            System.out.println(bilangan + " bukan bilangan prima");
        } else {
            System.out.println(bilangan + " merupakan bilangan prima");
        }
    }
}