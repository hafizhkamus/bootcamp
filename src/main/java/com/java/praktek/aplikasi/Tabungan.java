package com.java.praktek.aplikasi;

import java.math.BigDecimal;

public class Tabungan{

    private Double sukuBunga;
    private Integer saldo;
    private BigDecimal akual;
    private String kriteriaProduk;

    public Double getSukuBunga(){
        return sukuBunga;
    }

    public void setSukuBunga(Double sukuBunga){
        this.sukuBunga = sukuBunga;
    }

    public Integer getSaldo(){
        return saldo;
    }

    public void setSaldo(Integer saldo){
        this.saldo = saldo;
    }

    public BigDecimal getAkual(){
        return akual;
    }

    public void setAkual(BigDecimal akual){
        this.akual = akual;
    }

    public String getKriteriaProduk(){
        return kriteriaProduk;
    }

    public void setKriteriaProduk(String kriteriaProduk){
        this.kriteriaProduk = kriteriaProduk;
    }

}