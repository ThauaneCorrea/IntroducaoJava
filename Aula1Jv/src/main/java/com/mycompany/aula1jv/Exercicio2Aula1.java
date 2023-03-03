
package com.mycompany.aula1jv;

import java.util.Scanner;

public class Exercicio2Aula1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double base;
        double altura;
        double area;
        double total;
        
        System.out.println("Informe a base do triangulo em centimetros");
        base = ler.nextDouble();
        System.out.println("Informe a altura do triangulo em centimetros");
        altura = ler.nextDouble();
        
        area = base*altura/2;
        total = area*0.01;
        System.out.println("A área do triângulo é: "+total+" metros");
        
        if (area > 10) {
            System.out.println("Hello World");
        }
        else {
            System.out.println("...");
        }
        
        
    }
}
