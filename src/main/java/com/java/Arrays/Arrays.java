package com.java.Arrays;

import java.util.*;

public class Arrays{

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);

        //Integer[] value = {1, 2, 3, 4, 5, 10, 50};

        /*for( Integer i = 0; i < value.length; i++){
            System.out.println(
                String.format("Nilai ke %s adalah %s", i, value[i])
            );
        }*/

        Integer[] values = new Integer[5];

        for(Integer i = 0; i < values.length; i++){
            System.out.print("Masukan nilai Array = ");
            values[i] = inputClass.nextInt();
            System.out.println(
                String.format("Nilai Array yang di input adalah = %s", values[i])
            );
        }

        System.out.print(
            String.format("Jumlah nilai seluruh Array anda adalah = %s", (values[0] + values[1] + values[2] + values[3] + values[4]))
        );

       
        
    }
}