/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosjava;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
// encoding: UTF-8

public class ExerciciosJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Exercício 1
        System.out.println("Insira o primeiro número ");
        double n1 = scanner.nextDouble();
        
        System.out.println("Insira o segundo número ");
        double n2 = scanner.nextDouble();
        
        double soma = n1 + n2;
        double sub = n1 - n2;
        double multi = n1 * n2;
        double div = n1 / n2;
        
        System.out.println("A soma deu: " + soma + " A subtracao deu: " + sub +  "A multiplicacao deu: " + multi + " A divisao deu: " + div);
        
        //Exercício 2
         //Pede o número para o usuário
        System.out.println("Insiraa temperatur e C° ");
        double tempc = scanner.nextDouble();
        
        //Faz as conversões de temperatura
        double tempf = (tempc * 1.8) + 32;
        double tempK = tempc + 273.15;
        //Exibe na tela o resultado
        System.out.println("A temperatura em Celsius eh: " + tempc + " Em Farenheit " + tempf + " Em Kelvin " + tempK);
        
        //Exercíco 3
        
        // 1. Pedir o número para o usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // 2. Criar uma variável para dizer se é primo ou não
        boolean ehPrimo = true;

        // 3. Verificar se o número é menor que 2 (não é primo)
        if (numero < 2) {
            ehPrimo = false;
        } else {
            // 4. Testar se o número tem algum divisor além de 1 e ele mesmo
            for (int i = 2; i < numero; i++) { /*O for repete a mesma ação enquanto ela for verdadeira. 
                Dentro do for é criado a váriavel i para calcular os números até chegar no número que a pessoa digitou
                Ele começa valendo 2 porque 1 não é primo, enquanto 1 for menor que o número ele vai repitindo, quando
                ele estiver com o mesmo valor a sequência para, o i++ vai somar 1 ao valor de i para saber
                o limite de número que deve ser cálculado.*/
                if (numero % i == 0) { /*Ele cria a condição: seo resto da divisão inteira entre o número que 
                    a pessoa escolheu for 0, o número não é primo, pois nãodevia ser divisivel com nenhum outro 
                    número.*/
                    ehPrimo = false; //Atribui falso a váriavel ehPrio
                    break; // já achou que não é primo, pode parar
                }
            }
        }

        // 5. Mostrar o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo!");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }

        scanner.close();
    }
}
