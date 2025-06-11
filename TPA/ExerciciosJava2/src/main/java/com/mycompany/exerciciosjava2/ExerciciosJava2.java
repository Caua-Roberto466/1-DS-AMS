package com.mycompany.exerciciosjava2;

import javax.swing.JOptionPane;

public class ExerciciosJava2 {

    public static void main(String[] args) {
        
        // Exercício 1 - Cálculo de idade em dias
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade em anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade em meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade em dias:"));
        int diasT = (anos * 365) + (meses * 30) + dias;
        JOptionPane.showMessageDialog(null, "Você viveu " + diasT + " dias.");

        // Exercício 2 - Médias
        double num1 = 8.9;
        double num2 = 7;
        double num3 = 4.5;
        double num4 = 6;
        double media1 = (num1 + num2) / 2;
        double media2 = (num3 + num4) / 2;
        double soma = media1 + media2;
        double mediaF = soma / 2;
        JOptionPane.showMessageDialog(null, "Primeira média: " + media1
                + "\nSegunda média: " + media2
                + "\nSoma das médias: " + soma
                + "\nMédia das médias: " + mediaF);

        // Exercício 3 - Reajuste salarial de 1%
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário: R$"));
        double salarioF = salario + (salario * 0.01);
        JOptionPane.showMessageDialog(null, "Com o reajuste, o salário passou a ser: R$ " + salarioF);

        // Exercício 4 - Cálculo com IPI
        double ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do IPI:"));
        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça 1:"));
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 1:"));
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 1:"));

        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça 2:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 2:"));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 2:"));

        double total = (valor1 * quant1 + valor2 * quant2) * (1 + ipi / 100);
        JOptionPane.showMessageDialog(null, String.format("O valor total a ser pago (com IPI) é: R$ %.2f", total));

        // Exercício 5 - Comparação com salário mínimo
        int salarioM = 1518;
        double salario_ex5 = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
        double diferenca = salario_ex5 / salarioM;
        JOptionPane.showMessageDialog(null, String.format("Você recebe %.2f salários mínimos.", diferenca));

        // Exercício 6 - Antecessor e Sucessor
        int numero_ex6 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int ant = numero_ex6 - 1;
        int suc = numero_ex6 + 1;
        JOptionPane.showMessageDialog(null, "O antecessor de " + numero_ex6 + " é " + ant + 
                                            " e o sucessor é " + suc);
    }
}
