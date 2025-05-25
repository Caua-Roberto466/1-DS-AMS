/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendendoscanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class AprendendoScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();
        
        
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();
        
        
        
        System.out.println(nome + ", você tem " + idade + " anos");
        
        
    }
}
