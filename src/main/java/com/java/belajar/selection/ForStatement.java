package com.java.belajar.selection;

import java.util.*;

public class ForStatement{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);
        Integer bilangan1, bilangan2;
        
        System.out.print("Masukan bilangan ke 1 = ");
        bilangan1 = inputClass.nextInt();
        System.out.print("\nMasukan bilangan ke 2 = ");
        bilangan2 = inputClass.nextInt();

        for(Integer awal = bilangan1; awal <= bilangan2; awal++){
            if(awal % 2 == 0){
                System.out.print(awal + " ");
            }
        }
    }
}