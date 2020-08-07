package com.java.collection.model;

import java.util.*;

public class Kampus{

    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Integer getTahunAjaran(){
        return tahunAjaran;
    }

    public void setTahunAjaran(Integer tahunAjaran){
        this.tahunAjaran = tahunAjaran;
    }

    public String getJurusan(){
        return jurusan;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public Kampus(){

    }

    public Kampus(String nama, Integer tahunAjaran, String jurusan){
        this.nama = nama;
        this.tahunAjaran = tahunAjaran;
        this.jurusan= jurusan;
    }
}