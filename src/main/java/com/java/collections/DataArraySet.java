package com.java.collection;

import java.util.*;

public class DataArraySet{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);

        Set datas = new HashSet<>();

        System.out.print("Masukan nama anda = ");
        String nama = inputClass.nextLine();

        System.out.print("\nMasukan kelas anda = ");
        String kelas = inputClass.nextLine();

        System.out.println("\nMasukan moto hidup anda = ");
        String moto = inputClass.nextLine();

        datas.add(nama);
        datas.add(kelas);
        datas.add(moto);

        System.out.println(String.format("\nJumlah nilai yang di input adalah %s", datas.size()));
        for(Object data : datas){
            System.out.println(data.toString());
        }
    }
}