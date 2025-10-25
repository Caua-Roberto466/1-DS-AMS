package com.mycompany.nomescrescentes;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class NomesCrescentes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = new String[6];
        
        System.out.println("Digite os nomes");
        for( int i = 0; i < nomes.length; i++){
            nomes[i] = scan.nextLine();
        }
        Arrays.sort(nomes);
        System.out.println("\n\nNomes crescente");
        for(int a = 0; a < nomes.length; a++){
            System.out.println(nomes[a]);
        }
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("\n\nNomes decrescentes");
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
    }
}
