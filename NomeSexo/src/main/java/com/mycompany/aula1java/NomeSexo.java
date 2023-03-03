package com.mycompany.aula1java;

import java.util.Scanner;

public class NomeSexo {

    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      
      String nome;
      char sexo;
      
        System.out.println("Qual o seu nome?");
        nome = ler.nextLine();
        System.out.println("Qual o seu sexo?");
        sexo = ler.next().charAt(0);
        
         
        switch (sexo) {
            case 'f' -> System.out.println("Feminino");
            case 'm' -> System.out.println("Masculino");
            case 'g' -> System.out.println("Gay");
            case 'l' -> System.out.println("Lésbica");
            default -> System.out.println("Programador");
        }
        
        }
    }

