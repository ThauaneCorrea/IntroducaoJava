package com.mycompany.aula1jv;

import java.util.Scanner;
public class CalculeAreaDeCirculo {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double raio;
        
         
       
        
        System.out.println("Informe o raio do circulo: ");
        raio = ler.nextDouble();
        double areaCirculo = (raio*raio * 3.14);
        
        System.out.println("A área do circulo é " +areaCirculo );
        
        System.out.printf("%.2f",areaCirculo);
        
        
        
    }
}
