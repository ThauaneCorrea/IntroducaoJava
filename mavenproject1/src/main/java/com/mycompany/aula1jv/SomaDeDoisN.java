package com.mycompany.aula1jv;

import java.util.Scanner;
public class SomaDeDoisN {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero1;
        int numero2;
        
        
        System.out.println("Informe o primeiro número: ");
        numero1 = ler.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = ler.nextInt();
        
      // double soma = (numero1 + numero2);
        
        //System.out.println("A soma dos dois números é: " + soma );
        
        System.out.printf("\nResultado\n");
        System.out.printf("%d + %d = %3d\n ", numero1, numero2, (numero1 + numero2));
        System.out.printf("%d - %d = %3d\n ", numero1, numero2, (numero1 - numero2));
        System.out.printf("%d * %d = %3d\n ", numero1, numero2, (numero1 * numero2));
        System.out.printf("%d + %d = %3d\n ", numero1, numero2, (numero1 / numero2) );
        System.out.printf("%d / %d = %3d (divisão inteira) \n ",numero1, numero2, (numero1 / numero2));
        System.out.printf("%d / %d = %6.2f (divisão exata)", numero1, numero2, ( (double)( numero1 / numero2)));
        
        
        
    }
}
