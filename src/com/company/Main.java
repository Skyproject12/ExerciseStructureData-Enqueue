package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int a;
        String nama;
        String pesanan;
        int jumlah;
        antrian antri;
        squeu <antrian> mhs = new squeu ();
            do {
                System.out.println("======= Kasir Angkringan");
                System.out.println("1. Input Antrian");
                System.out.println("2. Proses Antrian");
                System.out.println("3. Daftar Antrian");
                System.out.println("4. Antrian Pertama");
                System.out.println("0. exit");
                System.out.println("masukkan pilihan");
                a = scan.nextInt();
                if (a == 1) {
                    antri = new antrian();
                    System.out.println("nama");
                    nama = scan.next();
                    System.out.println("pesanan");
                    pesanan = scan.next();
                    System.out.println("jumlah");
                    jumlah = scan.nextInt();
                    antri.setNama(nama);
                    antri.setPesanan(pesanan);
                    antri.setJumlah(jumlah);
                    mhs.insertbelakang(antri);
                }
                if (a == 2) {
                    System.out.println("data berhasi di proses");
                    mhs.hapusdepan();
                }
                if (a == 3) {
                    System.out.println("daftar antrian");
                    mhs.view();
                    System.out.println("=======");
                }
                if (a == 4) {
                    System.out.println("data pertama");
                    mhs.viewdepan();
                }
                if (a == 0) {

                }
            }while (a!=0);
    }
}
