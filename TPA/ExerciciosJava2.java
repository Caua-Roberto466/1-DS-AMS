package com.mycompany.exerciciosjava2;
import java.util.Scanner;
public class ExerciciosJava2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Exercício 1
        System.out.println("Insirsa sua idade em anos:");
        int anos = sc.nextInt();
        
        System.out.println("Insira sua idade em meses:");
        int meses = sc.nextInt();
        
        System.out.println("Insira sua idade em meses:");
        int dias = sc.nextInt();
        
        int diasT = (anos*365)+(meses*30)+dias;
        
        System.out.println("Você viveu "+diasT+" dias");
        
        //Exercício 2
        double num1 = 8.9;
        double num2 = 7;
        double num3 = 4.5;
        double num4 = 6;
       
        double media1 = (num1+num2)/2;
        double media2 = (num3+num4)/2;
        double soma = media1+media2;
        double mediaF = soma/2;
       
        System.out.println("Primeira média: "+media1);
        System.out.println("segunda média: "+media2);
        System.out.println("Soma das médias: "+soma);
        System.out.println("Média das médias: "+mediaF);
        
        //Exercício 3
        System.out.println("Insira seu salário: R$");
        double salario = sc.nextDouble();
        double porcento = salario*(1/100);
        double salarioF = salario+porcento;
        System.out.println("Com o reajuste, o salário passou a ser: "+salarioF);
        
        //Exercício 4

        // Entrada dos dados
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = sc.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int cod1 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite a quantidade da peça 1: ");
        int quant1 = sc.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int cod2 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valor2 = sc.nextDouble();
        System.out.print("Digite a quantidade da peça 2: ");
        int quant2 = sc.nextInt();

        // Cálculo do valor total
        double total = (valor1 * quant1 + valor2 * quant2) * (1 + ipi / 100);

        // Saída do resultado
        System.out.printf("O valor total a ser pago (com IPI) é: R$ %.2f\n", total);


        
        //Exercício 5
        int salarioM = 1518;
        System.out.println("Qual o seu salário?");
        double salario_ex5 = sc.nextInt();
        double diferencia = salario_ex5/salarioM;
        System.out.println("A diferencia Você recebe "+diferencia+" salários minimo");
        
        //Exercício 6
        System.out.println("Digite o primeiro número: ");
        int numero_ex6 = sc.nextInt();
        int ant = numero_ex6-1;
        int suc = numero_ex6+1;
        
        System.out.println("O antecessor de "+numero_ex6+" é "+ant+ " e o sucessor é "+suc);
        sc.close();
    }
}
