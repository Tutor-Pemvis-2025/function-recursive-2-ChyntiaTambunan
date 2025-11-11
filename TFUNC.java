// Chyntia Lovenia Tambunan - 12S25015 // 
// Julia Simatupang - 12S25020 // 
// Theressia Simanjuntak - 12S25029 // 

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(n);
        System.out.println("Bilangan yang dimasukkan: " + n);
        System.out.println("Hasil perhitungan rekursif: " + hitungRekursif(n));
    }
    
    public static int hitungRekursif(int n) {
        int angka;

        if (n == 1) {
            angka = 1;
        } else {
            angka = n + hitungRekursif(n - 1);
        }
        
        return angka;
    }
}

