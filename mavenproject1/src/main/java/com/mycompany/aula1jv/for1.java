package com.mycompany.aula1jv;

import java.util.Scanner;
public class for1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int a;
        int b = 0;
        System.out.println("Informe até onde o meu b é para ir: ");
        b = ler.nextInt();
        for ( a=0 ; a<b; a++) {
            System.out.printf("Inform o %2d. valor: " , (a+1),b);
        }
         
        System.out.println("Informe quantos números você deseja somar! ");
        
        
        
        
        
    }
}
