package com.java.praktek.bankir;

import com.java.praktek.aplikasi.Tabungan;

public class NasabahPerorangan extends Nasabah{

    private String namaLengkap;
    private String alamatRumah;
    private String nomorHp;
    private String foto;
    private Tabungan tabungan;

    public String getNamaLengkap(){
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }

    public String getAlamatRumah(){
        return alamatRumah;
    }

    public void setAlamatRumah(String alamatRumah){
        this.alamatRumah = alamatRumah;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public String getFoto(){
        return foto;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public Tabungan getTabungan(){
        return tabungan
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}