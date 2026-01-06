/*
 * Click cu nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calculadora {

    public static void main(String[] args) {
        //Coloca os valores dos doi números
        double num1 = 3.8;
        double num2 = 4.9;
        System.out.println("Os valores sao: " + num1 + "e" + num2);
        
        //Fazendo as contas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double resto = num1 % num2;
        
        System.out.println("Resultados das operações é: ");
        System.out.println("A soma e: " + soma);
        System.out.println("A subtracao e: " + subtracao);
        System.out.println("A multiplicacao e: " + multiplicacao);
        System.out.println("A diviso e: " + divisao);
        System.out.println("O resot da divisao e: " + resto);
    }
}
