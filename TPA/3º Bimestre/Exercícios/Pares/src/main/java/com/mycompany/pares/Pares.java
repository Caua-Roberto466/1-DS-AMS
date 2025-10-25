package com.mycompany.pares;
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int contadorPares = 0;
        
        System.out.println("Digite os números");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 2 == 0){
                pares[contadorPares] = numeros[i];
                contadorPares ++;
            }
        }
        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i]);
        }
    }
}
