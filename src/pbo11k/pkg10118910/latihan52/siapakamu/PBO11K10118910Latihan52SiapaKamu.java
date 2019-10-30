/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan52.siapakamu;

/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118919
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan siapa kamu berdasarkan status konsep pewarisan class
 */
public class PBO11K10118910Latihan52SiapaKamu {

   
    public static void main(String[] args) {
        Dosen ds = new Dosen();
        ds.setNama("Rizki Adam Kurniawan");
        ds.setUmur(27);
        ds.setNip("41227829930");
        ds.setMatakuliah("PBO");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO2");
        mhs.setNim("10110269");
        System.out.println("NIP DOSEN : "+ ds.getNip());
        ds.siapaKamu();
        ds.mengajarApa();
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
    }
    
}
