/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadosprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DadosPrimitivos {

    public static void main(String[] args) {
        // Declaração de variáveis primitivas
        byte posicao = 72; 
        short anonascimento = 2000; // você coloca quatro casas
        int numerodeposicao  = 100000; // mais usado pra por numero inteiro
        long dinherogasto  = 100000000L; // coloca números bem longos
        
        float pontos = 78.3f; // você coloca números com quebrado(com vírgula) f identifica o float 
        double media = 80.5; // mais certeiro que o float  
        
        char rank = 'A'; // guarda um único caractere
        boolean passou = true; //guarda se é verdadeiro ou falso
        
        System.out.println("Posicao que ficou: " + posicao);
        System.out.println("Ano de nascimento: " + anonascimento);
        System.out.println("numero de candidatos: " + numerodeposicao);
        System.out.println("Quantidade gasta no projeto: " + dinherogasto);
        System.out.println("Pontos na primeira fase: " + pontos + "Pontos");
        System.out.println("Media de todas as fases: " + media + "Kg");
        System.out.println("Qual grupo voce se inscreveu: " + rank);
        System.out.println("Passou?:" + passou);
    }
}

