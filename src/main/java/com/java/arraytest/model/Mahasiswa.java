package com.java.collection.model;

import java.util.*;
import java.sql.Date;


public class Mahasiswa{

    private String nim;
    private String name;
    private Date tanggalLahir;
    private Integer angkatan;
    private Kampus kampus;

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
      this.name= name;  
    }

    public Date getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getAngkatan(){
        return angkatan;
    }

    public void setAngkatan( Integer angkatan){
        this.angkatan = angkatan;
    }

    public Kampus getKampus(){
        return kampus;
    }

    public void setKampus(Kampus kampus){
        this.kampus = kampus;
    }

    public Mahasiswa(){

    }

    public Mahasiswa(String nim, String name, Date tanggalLahir, Integer angkatan, Kampus kampus){
        this.nim = nim;
        this.name = name;
        this.tanggalLahir = tanggalLahir;
        this.angkatan = angkatan;
        this.kampus = kampus;
    }

    @Override
    public String toString(){
       return String.format("| nim : %s | nama: %s | TTL : %s | angkatan : %s | kelas : %s | jurusan : %s",
          this.nim, this.name, this.tanggalLahir.toString(), this.angkatan, this.kampus.getNama(), this.kampus.getJurusan());
    }
}