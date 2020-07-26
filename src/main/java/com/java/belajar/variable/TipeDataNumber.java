package com.java.belajar.variable;

import java.util.*;

public class TipeDataNumber{

    public static void main(String[] args){

        Scanner inputClass = new Scanner(System.in);

        Integer min = inputClass.nextInt();
        Boolean b = true;
        
        System.out.println(b);
        System.out.println("nilai pilihan kamu adalah " + min);
        System.out.println("hafizh kamus 13 tauhid");

        System.out.print("Masukan besar segitiga = ");
        Integer besarSegitiga = inputClass.nextInt();

        for(Integer max = besarSegitiga; max >= 0; max--){
            System.out.print("* ");
            for(Integer maxb = max; maxb >= 0; maxb--){
                System.out.print("* ");
                if(max == maxb){
                    break;
                }
            }

            System.out.print("\n");
        }
    }
    
}