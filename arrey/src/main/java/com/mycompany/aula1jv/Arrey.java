package com.mycompany.aula1jv;

import java.util.Scanner;
public class Arrey{

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int n,soma = 0;

         
               
        System.out.println("Informe quantos números você deseja somar: ");
        n=ler.nextInt();
        int a[] = new int[n];
        System.out.println("Informe os" + n + "números :");

        
        for (int i = 0; i < n; i++){
            System.out.println("Informe o " + (i+1) + " número: ");
            a[i]= ler.nextInt();
        }
            
        for (int i = 0; i < n; i++){
        soma += ( a [i]);
        
        }
        
        System.out.println("O resultado da soma dos " + n + " números é:" + soma);
    }
        
        
        
        
    }
}
