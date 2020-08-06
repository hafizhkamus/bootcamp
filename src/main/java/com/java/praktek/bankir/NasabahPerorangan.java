package com.java.praktek.bankir;

import com.java.praktek.aplikasi.Tabungan;

public class NasabahPerorangan extends Nasabah{

    private String namaLengkap;
    private String alamatRumah;
    private String nomorHp;
    private String foto;
    private Tabungan tabungan;
    private String activemain;

    public NasabahPerorangan(String nomorIdentitas, String namaLengkap, String alamatRumah, String nomorHp, String activemain){
        this.setNomorIdentitas(nomorIdentitas);
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamatRumah;
        this.nomorHp = nomorHp;
        this.activemain = activemain;
        this.setSaldo(0);
        this.tabungan = new Tabungan();
        this.tabungan.setKriteriaProduk("Tabungan Mantap");
        this.tabungan.setSaldo(0);
        this.tabungan.setSukuBunga(0.1);
   }

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

    public String getActiveMain(){
        return activemain;
    }

    public void setActiveMain(String activemain){
        this.activemain = activemain;
    }

    public Tabungan getTabungan(){
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

    @Override
    public String toString(){
        return String.format("nasabah [noIdentitas: %s, status: %s, namaLengkap: %s, saldo Tabungan: %s, no.telp: %s]",
        this.getNomorIdentitas(), this.getActiveMain(), this.getNamaLengkap(), this.getTabungan().getSaldo(), this.getNomorHp());
    }
}