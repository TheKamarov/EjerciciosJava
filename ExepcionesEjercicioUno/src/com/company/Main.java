package com.company;

public class Main {

    public static void main(String[] args) {
        Integer numeroUno =  null;

        try {
            Integer resultado = numeroUno + 5;
        } catch(Exception e1) {
            e1.printStackTrace();
            System.out.println("Exploto todo!!");
        }
    }


}
