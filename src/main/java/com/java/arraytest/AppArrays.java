/*package com.java.arraytest;

import java.util.*;
import java.sql.Date;
import com.java.arraytest.model.Kampus;
import com.java.arraytest.model.Mahasiswa;

public class AppArrays{

    public static void main(String[] args) {
        
        Map<String, String> nameMapping = new HashMap<>();

        nameMapping.put("001", "Hafizh Faikar");
        nameMapping.put("002", "MUhammad Daffa");
        nameMapping.put("006", "Dani MUlyana");
        nameMapping.put("007", "Hilman Arrasyid");
        nameMapping.put("008", "Juan Juandi");
        nameMapping.put("009", "Asep Ntuy");
        nameMapping.put("010", "Mucikari Nikita Mirzani");

        System.out.println(String.format("nip : %s || nama mahasiswa : %s","001",nameMapping.get("001")
        ));

        Set<Integer> uniqNumber = new HashSet<Integer>(Arrays.asList(1,3,5,10,1,20,10,1,20,9,1));
        Integer[] uniqNumberic = uniqNumber.toArray(new Integer[] {});
            System.out.println(
                String.format("Bilangan ke 1 = %s Bilangan ke 3 = %s Bilangan ke 7 = %s",uniqNumberic[0],
                uniqNumberic[2], uniqNumberic[3]));
            
            System.out.println("\n\n");

            System.out.println("nilai seluruh Array = ");
            for(Object uniqNumbers : uniqNumber){
                System.out.println(uniqNumbers.toString());
            }

            List<Integer> uniqNumbericGanjil = new ArrayList();

            for (Integer bilangan : uniqNumberic){
                if (bilangan % 2 == 1){
                    uniqNumbericGanjil.add(bilangan);
                }
            }

            System.out.print(uniqNumbericGanjil + ", "); 

            Kampus kampusI = new Kampus("Fakultas Teknik Informatika", 2020, "TI");
            Kampus kampusJ = new Kampus("Fakultas Teknologi Robotik", 2020, "TR");

            List<Mahasiswa> calonSarjana = 
                Arrays.asList(
                    new Mahasiswa("1920118075", "Hafizh Faikar", Date.valueOf("2003-12-24"), 2020, kampusI),
                    new Mahasiswa("1920118075", "Hafizh Faikar", Date.valueOf("2003-12-24"), 2020, kampusI),
                    new Mahasiswa("1920118075", "Hafizh Faikar", Date.valueOf("2003-12-24"), 2020, kampusI),
                    new Mahasiswa("1920118075", "Hafizh Faikar", Date.valueOf("2003-12-24"), 2020, kampusI)
                );

                for(Mahasiswa mhs : calonSarjana){
                    System.out.println(mhs.toString());
                }
    }
}*/