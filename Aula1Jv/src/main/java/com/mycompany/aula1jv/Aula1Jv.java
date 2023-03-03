
package com.mycompany.aula1jv;

import java.util.Scanner;
public class Aula1Jv {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double base;
        double altura;
        
        System.out.println("Informe a base do triangulo em centimetros");
        base = ler.nextDouble();
        System.out.println("Informe a altura do triangulo em centimetros");
        altura = ler.nextDouble();
        
        System.out.println("A área do triângulo é: "+ base*altura/2 + " centímetros");
        
        
        
    }
}
