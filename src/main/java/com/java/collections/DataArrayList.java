package com.java.collection;

import java.util.*;
import java.sql.Date;
import java.time.LocalDate;

public class DataArrayList{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);

        List data = new ArrayList();

        System.out.print("Masukan username anda \n");
        //Input data String
        String name = inputClass.nextLine();

        // add element to List
        data.add("Hafizh Faikar");
        data.add("Faikar Hafizh");
        data.add(11);
        data.add(false);
        data.add(Date.valueOf(LocalDate.now()));
        data.add(name);

        //show element by index
        Object namaUser = data.get(5);
        System.out.println(String.format("Username anda adalah %s", namaUser.toString()));

       data.set(0, "Kam-Argana");
       boolean exist = data.equals("Hafizh Faikar");
       System.out.println(String.format("| Hafizh Faikar | tersedia ? %s", exist));

       for(Integer i = 0; i < data.size(); i++){
           System.out.println(String.format("Element string adalah : %s\n", data.get(i).toString()));
       }
    }
}