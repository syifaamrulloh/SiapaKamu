/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan52.siapakamu;

/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan siapa kamu berdasarkan status konsep pewarisan class
 */
public class Dosen extends Manusia{
    private String nip,matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya "+ nama +" umur "+umur+" tahun sendang mengajar matakuliah "+ matakuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}
