package com.mycompany.exswichcase;
import java.util.Scanner;
public class ExSwichCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Exercíco 1, transporte e passagens
        System.out.println("Qual o seu transporte? (1, 2, 3 ou 4)");
        int escolha_transporte = scan.nextInt();
        
        switch(escolha_transporte){
            case 1:
                System.out.println("Você vai de ônibus, e cada passagem custa R$4,40, quantas passagens você vai comprar?");
                int quantia_onibus = scan.nextInt();
                double total_onibus = 4.40*quantia_onibus;
                System.out.println("Você pagará R$"+total_onibus);
                break;
            case 2:
                System.out.println("Você vai de metrô, cada passagem custa R$5,00, quantas passagens você vai comprar?");
                int quantia_metro = scan.nextInt();
                double total_metro = 5*quantia_metro;
                System.out.println("Você vai pagar R$"+total_metro);
                break;
            case 3:
                System.out.println("Você vai de trem, a passagem custa R$6,50, quantas passagens você vai comprar?");
                int quantia_trem = scan.nextInt();
                double total_trem = 6.50*quantia_trem;
                System.out.println("Você vai pagar R$"+total_trem);
                break;
            case 4:
                System.out.println("Você vai de rodoviário, a passagem custa R$12,00, quantas passagens voc|ê vai comprar?");
                int quantia_rodo = scan.nextInt();
                double total_rodo = 12*quantia_rodo;
                System.out.println("Você vai pagar R$"+total_rodo);
            default:
                System.out.println("Opção inválida");
        }
        
        //Exercíco 2, Atentidemnto bancário
        System.out.println("O que você deseja fazer? (1 - consultar saldo, 2 -  realizar saque, 3 - depositar dinheiro ou 4 - encerrar atendimento)");
        int escolha_banco = scan.nextInt();
        double saldo = 1000;
        switch(escolha_banco){
            case 1:
                System.out.println("Seu saldo é de R$"+saldo);
                break;
            case 2:
                System.out.println("Quanto você quer sacar?");
                double saque = scan.nextDouble();
                if(saque > saldo){
                    System.out.println("[Erro] saldo insuficiente");
                }else{
                     double novo_saldo = (double) (saldo - saque);
                     System.out.println("Saque reaalizado com sucesso, seu novo saldo é R$"+novo_saldo);
                }
                break;
            case 3:
                System.out.println("Quanto você quer depositar?");
                double deposito = scan.nextDouble();
                double novo_saldo = (double)(saldo+deposito);
                System.out.println("Seu novo saldo é de R$"+novo_saldo);
                break;
            case 4:
                System.out.println("Encerrando preograma");
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        //Exercíco 3, Classificador de faixa etária
        System.out.println("Insira sua idade");
        int idade = scan.nextInt();
        int faixa_etaria;
        if(idade < 13){
            faixa_etaria = 1;
        }else if(idade < 18){
            faixa_etaria = 2;
        }else if(idade < 60){
            faixa_etaria = 3;
        }else{
            faixa_etaria = 4;
        }
        switch (faixa_etaria){
            case 1:
                System.out.println("Você é uma criança");
                break;
            case 2:
                System.out.println("VocÊ é um adolescente");
                break;
            case 3:
                System.out.println("Você é um adulto");
                break;
            case 4:
               System.out.println("Você é um idoso"); 
               break;
            default:
                System.out.println("Idade inválida");
        }
        scan.close();
    }
}
