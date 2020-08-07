package com.java.collection;

import java.util.*;
import java.sql.Date;

public class DataWithGenerics{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);

        List<Employee> employ = new ArrayList<>();

        System.out.print("Nama orang paling ganteng di dunia adalah = ");
        String nama1 = inputClass.nextLine();

        employ.add(new Employee( nama1, "trainer", Date.valueOf("2003-8-24")));
        employ.add(new Employee("Dani Mulyana", "PublicEnemy", Date.valueOf("2003-8-22")));
        employ.add(new Employee("Abil Goblok", "Best Hate Commander", Date.valueOf("2003-8-25")));
     
        for(Employee employe : employ){
            System.out.println(
                String.format("Id pengguna : %s\nNama pengguna : %s\nJabatan : %s\nTanggal-lahir : %s\n\n",
                employe.getId(),employe.getName(),employe.getJobTitle(),employe.getBirthDate())
            );
        }
     
        /* Map<String,String> mapOfIdentity = new HashMap<>();

        mapOfIdentity.put("a", "Hafizh Faikar");
        mapOfIdentity.put("z", "Hafizh Kamus");

        for(Map.Entry<String,String> entry : mapOfIdentity.entrySet()){
            System.out.println(String.format("%s : %s", entry.getKey(), entry.getValue()));
        }*/
    }
}