package com.java.belajar.operator;



public class OperatorPerbandingan{

    public static void main(String[] args){
        Integer bilA = 10;
        Integer bilB = 20;

        System.out.println(String.format("Bilangan A == Bilangan B => %s", (bilA == bilB)));

        System.out.println(String.format("Bilangan A == Bilangan A => %s", (bilA == bilA)));
    }
}