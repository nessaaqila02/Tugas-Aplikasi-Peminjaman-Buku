package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

class Buku {
    String judul, pengarang;
    int kode;

    Buku(String  judul, String pengarang, int kode) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.kode = kode;
    }

    void detailBuku() {
        System.out.println("Kode Buku      : " + kode);
        System.out.println("Judul Buku     : " + judul);
        System.out.println("Nama Pengarang : " + pengarang);
        System.out.println("");
    }


}


public class Main {

    public static void main(String[] args) {
        String nama, jurusan;
        int npm, semester, jumlahBuku;
        Scanner a = new Scanner(System.in);

        System.out.println("Selamat Datang Diprogram Peminjaman Buku");
        System.out.println("");

        System.out.println("===========================================================");
        System.out.println("INPUT DATA PEMINJAM");
        System.out.println("===========================================================");
        System.out.print("Masukkan Nama                      : ");
        nama = a.nextLine();
        System.out.print("Masukan Jurusan                    : ");
        jurusan = a.nextLine();
        System.out.print("Masukkan NPM                       : ");
        npm = a.nextInt();
        System.out.print("Masukkan Semester                  : ");
        semester = a.nextInt();
        System.out.print("Masukkan Jumlah Buku Yang Dipinjam : ");
        jumlahBuku = a.nextInt();
        System.out.println("===========================================================");

        System.out.println("");

        System.out.println("===========================================================");
        System.out.println("DAFTAR BUKU");
        System.out.println("===========================================================");
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 01);
        Buku buku2 = new Buku("Aneka Pustaka", "Rusman Sutiasumarga", 02);
        Buku buku3 = new Buku("Belajar Otodidak Autocad 2d", "Computing & Internet", 03);
        Buku buku4 = new Buku("Bersahabat Dengan Alam", "Edinar Buana", 04);
        Buku buku5= new Buku("Dongeng Anak Klasik Dunia", "N.Van Hictun", 05);

        buku1.detailBuku();
        buku2.detailBuku();
        buku3.detailBuku();
        buku4.detailBuku();
        buku5.detailBuku();

        System.out.println("===========================================================");
        System.out.println("INPUT DATA BUKU");
        System.out.println("===========================================================");
        int jumlahBuku_arr[] = new int[jumlahBuku];
        String kode_arr[] = new String[jumlahBuku];
        String judul_arr[] = new String[jumlahBuku];
        String pengarang_arr[] = new String[jumlahBuku];
        for (int b = 0; b < jumlahBuku; b++) {
            System.out.print("Masukan Kode Buku  : ");
            kode_arr[b] = a.next();
            System.out.print("Masukan Judul Buku : ");
            judul_arr[b] = a.next();
            System.out.print("Masukan Pengarang  : ");
            pengarang_arr[b] = a.next();
            System.out.println("");
        }

        System.out.println ("==========================================================");
        System.out.println ("DATA PEMINJAMAN");
        System.out.println ("==========================================================");
        System.out.println ("Nama Mahasiswa               : " + nama);
        System.out.println ("NPM                          : " + npm);
        System.out.println ("Semester                     : " + semester);
        System.out.println ("Jurusan                      : " + jurusan);
        System.out.println ("Daftar buku yang dipinjam    : ");
        for (int b = 0;b<jumlahBuku;b++){
            System.out.println ("Judul Buku Ke : " + b +": " + judul_arr [b]);
        }
        Date peminjaman = new Date();
        System.out.println("Tanggal Peminjaman           : " + peminjaman);
        Date pengembalian = DateUtils.addDays(peminjaman, 7);
        System.out.println("Tanggal Pengembalian         : " + pengembalian);

    }
}
