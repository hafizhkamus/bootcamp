package com.java.belajar.selection;


import java.util.*;


public class ForStarMethod{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);
        
        System.out.print("Masukan nilai segitiga = ");
        Integer bilangan1 = inputClass.nextInt();
        System.out.println(String.format("\nNilai segitiga yang di input adalah = %s", bilangan1));

        for(Integer i = 0; i < bilangan1; i++){
            for(Integer j = 0; j < bilangan1; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }

            System.out.println(" ");
        }
    }
}