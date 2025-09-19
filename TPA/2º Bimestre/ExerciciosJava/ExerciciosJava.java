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
        System.out.println("Insira a temperatur e C° ");
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
        
        //Exercíco 4 - Calculadora de média das notas
        System.out.println("Insira a nota: ");
        int nota1 = scanner.nextInt();
        
        System.out.println("Insira a nota: ");
        int nota2 = scanner.nextInt();
        
        System.out.println("Insira a nota: ");
        int nota3 = scanner.nextInt();
        
        System.out.println("Insira a nota: ");
        int nota4 = scanner.nextInt();
        
        double media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("A média do aluno foi: "+media);
        if (media < 7){
            System.out.println("Reprovado");
        }
        
        //Exercíco 5 Criar um algoritimo que leia um número e exiba a tabuada até O 10
        System.out.println("Insira o número: ");
        double num_tabuada = scanner.nextDouble();
        scanner.nextLine(); // Serve para permitir que o próximo scanner seja execultado sem problemas
        
        System.out.println(num_tabuada + " x 0 = "+ num_tabuada*0);
        System.out.println(num_tabuada + " x 1 = "+ num_tabuada*1);
        System.out.println(num_tabuada + " x 2 = "+ num_tabuada*2);
        System.out.println(num_tabuada + " x 3 = "+ num_tabuada*3);
        System.out.println(num_tabuada + " x 4 = "+ num_tabuada*4);
        System.out.println(num_tabuada + " x 5 = "+ num_tabuada*5);
        System.out.println(num_tabuada + " x 6 = "+ num_tabuada*6);
        System.out.println(num_tabuada + " x 7 = "+ num_tabuada*7);
        System.out.println(num_tabuada + " x 8 = "+ num_tabuada*8);
        System.out.println(num_tabuada + " x 9 = "+ num_tabuada*9);
        System.out.println(num_tabuada + " x 10 = "+ num_tabuada*10);
        
        //Exercício 6 - Deve ler dados do clientes e avalie e mostre uma pesquisa ao consumidor
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Sua data de nascimento (exemplo: 21/04/2009)");
        String data_nas = scanner.nextLine();
        
        System.out.println("Seu curso: ");
        String curso = scanner.nextLine();
        
        System.out.println("Sua serie: ");
        int serie = scanner.nextInt();
        
        System.out.println("Sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Seu peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+data_nas);
        System.out.println("Curso: "+curso);
        System.out.println("Serie: "+serie);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        
        
        
        scanner.close();
    }
}
