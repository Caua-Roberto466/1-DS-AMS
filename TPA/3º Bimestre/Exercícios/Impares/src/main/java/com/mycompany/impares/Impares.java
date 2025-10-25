package com.mycompany.impares;

import java.util.Scanner;

public class Impares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] impares = new int[10];
        int contadorimpares = 0;
        
        System.out.println("Digite os números");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 2 != 0){
                impares[contadorimpares] = numeros[i];
                contadorimpares++;
            }
        }
        for(int i = 0; i < impares.length; i++){
            System.out.println(impares[i]);
        }
    }
}
