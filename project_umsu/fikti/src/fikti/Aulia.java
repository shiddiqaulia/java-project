package fikti;

import java.util.Scanner;
public class Aulia {
    public static void main(String[] args){
        double Nilai1, Nilai2, hasil;
        boolean hasil1;
        
        Scanner keyboard = new Scanner(System.in);
        
//        ARITMATIKA
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
////
//        // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
        // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
//        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
        
//        OPERATOR PENUGASAN
           
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Penambahan
        hasil = Nilai1 += Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil += " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Pengurangan
        hasil = Nilai1 -= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil -= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Perkalian
        hasil = Nilai1 *= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil *= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Pembagian
        hasil = Nilai1 /= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil /= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Sisa Bagi
        hasil = Nilai1 %= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil %= " + hasil);


//          OPERATOR PEMBANDING
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Lebih besar
        hasil1 = Nilai1 > Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 > Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Lebih kecil
        hasil1 = Nilai1 < Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 < Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Sama Dengan
        hasil1 = Nilai1 == Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 == Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Tida Sama Dengan
        hasil1 = Nilai1 != Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 != Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Lebih Besar Sama Dengan
        hasil1 = Nilai1 >= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 >= Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Lebih Kecil Sama Dengan
        hasil1 = Nilai1 <= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 <= Nilai2 = " + hasil1);

//          OPERATOR BITWISE
        int Nilai3, Nilai4, hasil3;
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise and (&)
        hasil3 = Nilai3 & Nilai4;
        System.out.println("Bitwise and (&)");
        System.out.println("Nilai3 & Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise OR (|)
        hasil3 = Nilai3 | Nilai4;
        System.out.println("Bitwise OR (|)");
        System.out.println("Nilai3 | Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise XOR (|)
        hasil3 = Nilai3 ^ Nilai4;
        System.out.println("Bitwise XOR (^)");
        System.out.println("Nilai3 ^ Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Negasi (~)
        hasil3 = ~ Nilai4;
        System.out.println("Bitwise Negasi (~)");
        System.out.println("~Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Left Shift(<<)
        hasil3 = Nilai3 >>> Nilai4;
        System.out.println("Bitwise Left Shift(<<)");
        System.out.println("Nilai3 << Nilai4 = " + hasil3);

        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Right Shift (>>)
        hasil3 = Nilai3 >> Nilai4;
        System.out.println("Bitwise Right Shift (>>)3");
        System.out.println("Nilai3 >> Nilai4 = " + hasil3);
        
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Right Shift Unsigned (>>>)
        hasil3 = Nilai3 >>> Nilai4;
        System.out.println("Bitwise Right Shift Unsigned (>>>)");
        System.out.println("Nilai4 >>> Nilai3 = " + hasil3);
    }
}
