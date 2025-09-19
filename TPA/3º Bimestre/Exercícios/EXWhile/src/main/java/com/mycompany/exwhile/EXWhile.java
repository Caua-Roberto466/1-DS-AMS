package com.mycompany.exwhile;
import java.util.Scanner;
public class EXWhile {

    public static void main(String[] args) {
        System.out.println("identificador de números");
        Scanner scan = new Scanner(System.in);
        //Exercício 1
        int numero_par = 1;
        int total_par = 0;
        while (numero_par <= 20){
            if(numero_par % 2 == 0){
                System.out.println("O número " + numero_par + " é par");
                numero_par ++;
                total_par ++;
            }else{
                numero_par ++;
            }
        }
        System.out.println("existem " + total_par + "números pares entre 2 e 20");
        
        System.out.println("Insira um número para saber sua tábuada");
        int num_tabuada = scan.nextInt();
        int controle = 1;
        while(controle <= 10){
            int mult = controle * num_tabuada;
            System.out.println(num_tabuada+" x " + controle + " = "+mult);
            controle ++;
        }
        
        //Exercício 3
        int controle_100 = 100;
        int quant = 0;
        while(controle_100 <= 125){
            quant ++;
            controle_100 ++;
        }
        System.out.println("Exixtem "+ quant+ " números entre 100 e 125");
        
        //Exercício 4
        System.out.println("insira o valor inicial");
        int valor_inicial = scan.nextInt();
        
        System.out.println("insira o valor final");
        int finaln = scan.nextInt();
        int quantia = 0;
        int controle_f = valor_inicial;
        while(controle_f <= finaln){
            if(controle_f % 2 != 0){
                controle_f ++;
                quantia ++;
            }else{
                controle_f ++;
            }
        }
        System.out.println("Existem "+quantia+ " números pares entre" + valor_inicial + " e " + finaln);
        scan.close();
    }
}