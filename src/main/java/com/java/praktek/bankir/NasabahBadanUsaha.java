package com.java.praktek.bankir;

import com.java.praktek.aplikasi.Tabungan;

public class NasabahBadanUsaha extends Nasabah{

    private String nomorHpWp;
    private String namaPerusahaan;
    private String alamatKantor;
    private Tabungan tabungan;

    public String getNomorHpWp(){
        return nomorHpWp;
    }

    public void setNomorHpWp(String nomorHpWp){
        this.nomorHpWp = nomorHpWp;
    }

    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatKantor(){
        return alamatKantor;
    }

    public void setAlamatKantor(String alamatKantor){
        this.alamatKantor = alamatKantor;
    }

}