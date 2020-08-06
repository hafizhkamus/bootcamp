package com.java.praktek.bankir;


public class Nasabah{

    private String nomorIdentitas;
    private boolean active;
    private Integer saldo;

    public String getNomorIdentitas(){
        return nomorIdentitas;
    }

    public void setNomorIdentitas(String nomorIdentitas){
        this.nomorIdentitas = nomorIdentitas;
    }

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public Integer getSaldo(){
        return saldo;
    }

    public void setSaldo(Integer saldo){
        this.saldo = saldo;
    }
}
