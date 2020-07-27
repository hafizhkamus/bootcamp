package com.java.belajar.selection;


import java.util.*;


public class ForStarMethod{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);
        
        System.out.print("Masukan nilai segitiga = ");
        Integer bilangan1 = inputClass.nextInt();
        System.out.println(String.format("Nilai segitiga yang di input adalah = %s \n", bilangan1));

        for(Integer i = 0; i < bilangan1; i++){
            for(Integer j = 0; j < bilangan1; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }

            System.out.println(" ");
        }

        System.out.print("\n\n");

        System.out.print("Masukan nilai piramida = ");
        Integer bilangan2 = inputClass.nextInt();
        System.out.println(String.format("Nilai piramida yang di input adalah = %s \n", bilangan2));
        
        for(Integer k = 0; k < bilangan2; k++){
            if(k % 2 == 0){
                for(Integer l = 0; l < bilangan2; l++){
                    System.out.print("* ");
                    if(k == l){
                        break;
                    }
                }
                System.out.println(" ");
            }
        }

        System.out.print("\n\n");

        System.out.print("Masukan nilai Segitiga = ");
        Integer bilangan3 = inputClass.nextInt();
        System.out.println(String.format("Nilai yang anda masukan adalah = %s \n", bilangan3));
        Integer pengurangan = 0;

        for( Integer m = bilangan3; m > 0; m--){
            for( Integer n = bilangan3; n > 0; n--){
                System.out.print(String.format("%s ", (bilangan3 - pengurangan)));
                pengurangan++;
                if(m + n == bilangan3 + 1){
                    break;
                }
            }
            pengurangan = 0;
            System.out.println(" ");
        }

        System.out.print("\n\n");

        System.out.print("Masukan nilai = ");
        Double bilangan4 = inputClass.nextDouble();
        System.out.println(String.format("Nilai yang anda masukan adalah = %s \n", bilangan4));
        System.out.print("Masukan nilai pangkat dan kelipatan (hanya satu nilai) = ");
        Double bilangan5 = inputClass.nextDouble();
        System.out.println(String.format("Nilai pangkat dan kelipatan yang dimasukan adalah = %s \n", bilangan5));
        Double pangkat = 0d;
        Double nilai1 = 0d;
        Double hasil;

        for(Double p = 0d; p <= bilangan4; p++){
            for(Double q = 0d; q <= bilangan5; q++){
                hasil = p * nilai1;
                if( p % 2 == 0){
                    System.out.print(hasil + " ");
                }
                else{
                    Double hasil2 = Math.pow(p, pangkat);
                    System.out.print(hasil2 + " "); 
                }
                pangkat++;
                nilai1++;
            }
            pangkat = 0d;
            nilai1 = 0d;
            System.out.println(" ");
        }
    }
}