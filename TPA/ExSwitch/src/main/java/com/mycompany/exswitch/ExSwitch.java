package com.mycompany.exswitch;
import java.util.Scanner;
public class ExSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Switch das frutas
        System.out.println("Insira um número entre 1 e 3");
        int escolhafruta = scan.nextInt();
        switch(escolhafruta){
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            default:
                System.out.println("fruta inválida");
                break;
        }
        
        //Sitch dos jogos
        System.out.println("Escolha um número entre 1 a 5");
        int escolhajogo = scan.nextInt();
        switch(escolhajogo){
            case 1:
                System.out.println("1-Minecraft");
                break;
            case 2:
                System.out.println("2-FIFA");
                break;
            case 3:
                System.out.println("3-Fortnite");
                break;
            case 4:
                System.out.println("4-Call of Duty");
                break;
            case 5:
                System.out.println("5-The Sims");
                break;
            default:
                System.out.println("Jogo inválido");
        }
        
        //Switch dias da semana
        System.out.println("Escolha um número entre 1 e 7");
        int escolhadia = scan.nextInt();
        switch(escolhadia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("Sabádo");
            default:
                System.out.println("Dia inválido");
        }
    }
}
