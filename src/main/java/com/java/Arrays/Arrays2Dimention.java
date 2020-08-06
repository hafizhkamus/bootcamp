package com.java.Arrays;

import java.util.*;

public class Arrays2Dimention{

    public static void main(String[] args) {
        
        String[][] mahasiswa = {
            {"Hafizh", "Sarjana Sastra", "1920118075"},
            {"Farshal", "Sarjana Sastra", "1920118077"},
            {"M.Daffa", "Sarjana Sastra", "1920118078"}
        };
    
        System.out.println(
            String.format("String dari [1][2] adalah = %s \n", mahasiswa[0][0])
        );

        for(Integer i = 0; i < mahasiswa.length; i++){
            for(Integer j = 0; j < mahasiswa[i].length; j++){
                System.out.print(String.format("| %s |", mahasiswa[i][j]));
            }
            System.out.println(" ");
        }
    }
}