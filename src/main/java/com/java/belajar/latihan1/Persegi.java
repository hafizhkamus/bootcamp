package com.java.belajar.latihan1;


import java.util.*;

public class Persegi{

    public static void main(String[] args){

        Scanner inputClass = new Scanner(System.in);
        Double sisi = inputClass.nextDouble();
        Double hasil = sisi * sisi;
        System.out.println(String.format("sisi = %s cm maka luas = %s m", sisi, (hasil/100)));
    }
}