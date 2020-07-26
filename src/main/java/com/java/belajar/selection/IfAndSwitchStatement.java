package com.java.belajar.selection;

import java.util.*;

public class IfAndSwitchStatement {

    public static void main(String[] args) {
        
        Scanner inputClass = new Scanner(System.in);
        Integer bilangan = inputClass.nextInt();
        Integer p = bilangan % 2;

        if (p == 0){
            System.out.println(String.format("bilangan anda %s adalah bilangan genap", bilangan));
        }
        else {
            System.out.println(String.format("bilangan anda %s adalah bilangan ganjil", bilangan));
        }
    }
}