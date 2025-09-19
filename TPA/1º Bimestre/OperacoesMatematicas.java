/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoes.matematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {
//EU Cauã Roberto Galdino da Silva, estou programando operações matemáticas em java
    public static void main(String[] args) {
        System.out.println("Calculando areas"); //Mostra a mensagem no output
        //Calcular área do quadrado
        double lado1 = 10; //Define o valor do primeiro lado do quadrado 
        double lado2 = 10; //Define o valor do seguno lado do quadrado
        double areaQ = lado1*lado2; //Calcula a área do quadrado multiplicando os lados
        System.out.println("A area do quadrado e " + areaQ); //Imprime no output o valor da áredo quadrado
        
        //Calcular área do retângulo
        double baseR = 29; //Informa a base do retângulo 
        double alturaR = 33; //Informa altura do retângulo              
        double areaR = baseR*alturaR; //Calcula a área do quadrado multiplicando a base por altura
        System.out.println("A area do retangulo e " + areaR); //Mostra no output o valor da área do retângulo
        
        //Calculando a área de um losango
        double diagonalMaior = 18; //Informa o valor da diagonal maior do losango
        double diagonalMenor = 11; //Informa o valor da diagonal menor do losango
        double areaL = (diagonalMaior*diagonalMenor)/2; //Calcula o valor da área do losango 
        System.out.println("a area do losango e " + areaL); //Mostra o valor da área do losango
        
        //Calculando a circunferênicia
        double raio = 13; //informa o valor do raio a circunferência
        double PI = 3.14; //informa o valor de PI  
        double areaC = PI*raio*raio; //Calcula a área da circunfêrencia
        System.out.println("A area da circunferencia e " + areaC); //Imprime no output o valor da áea
        
        System.out.println("Calculando a media"); //Mostra a menssagen no output
        double nota1 = 8; //Define  ovalor da nota 1
        double nota2 = 5; //Define o valor da nota 2
        double nota3 = 5.8; //Define o valor da nota 3
        double media = (nota1+nota2+nota3)/3; //Calcula a media dividindo a soma da nota por três 
        System.out.println("A meida do aluno foi " + media); //Mostra a mediano output
        
        System.out.println("Calculos matematicos");
        //Realiza as contas
        double num1 = 45; //Inseri o valor do número 1
        double num2 = 53;//Inseri o valor do número 2
        double soma = num1+num2; //Soma asváriaveis num1 e num2
        double subtracao = num1 - num2; //Subtrae o num2 do num1
        double divisao = num1/num2; //Divide num1 por num2
        double multiplicar = num1*num2; //Mutiplica num1 por num2
        
        //Imprimindo os resultados na tela
        System.out.println("A soma entre os dois numeros e " + soma);
        System.out.println("A subtracao entre eles e " + subtracao);
        System.out.println("A divisao e " + divisao);
        System.out.println("A multiplicacao e "+ multiplicar);
    }
}
