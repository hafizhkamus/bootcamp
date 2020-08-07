package com.java.collection;

import java.util.*;

public class DataArrayMap{

    public static void main(String[] args) {
        
        Map map = new HashMap<>();

        map.put("a", "Hafizh Faikar");
        map.put("b", "Hafizh Faikar");
        map.put("c", "Hafizh Faikar");
        map.put("d", "Hafizh Faikar");
        map.put("e", "Hafizh Faikar");
        map.put("f", "Hafizh Faikar");
        map.put("v", "Hafizh Faikar");

        System.out.println(String.format("Jumlah list yang tersedia adalah = %s", map.size()));

        map.forEach((key, value) -> {
            System.out.println(
                String.format(
                    "key name = %s\n value = %s",
                    key, value
                )
            );  
        }); 
    }
}