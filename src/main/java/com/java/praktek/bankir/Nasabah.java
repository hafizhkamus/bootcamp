package com.java.praktek.bankir;

import java.math.BigDecimal;

public class Nasabah{

    private String nomorIdentitas;
    private boolean active;
    private BigDecimal saldo;

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

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
}
