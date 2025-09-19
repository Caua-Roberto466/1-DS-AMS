package com.mycompany.condicoesemjava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CondicoesEmJava {

    public static void main(String[] args) {
        // Janela 1: Verificador de Alistamento
        JFrame janelaAlistamento = new JFrame("Verificador de Alistamento");
        janelaAlistamento.setSize(350, 200);
        janelaAlistamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaAlistamento.setLayout(null);

        JTextField campoIdade = new JTextField();
        campoIdade.setBounds(50, 30, 230, 25);
        janelaAlistamento.add(campoIdade);

        JButton botaoVerificar = new JButton("Verificar");
        botaoVerificar.setBounds(100, 70, 120, 30);
        janelaAlistamento.add(botaoVerificar);

        JLabel resultadoAlistamento = new JLabel("");
        resultadoAlistamento.setBounds(50, 120, 250, 25);
        janelaAlistamento.add(resultadoAlistamento);

        botaoVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoIdade.getText();
                try {
                    int idade = Integer.parseInt(texto);

                    if (idade < 18) {
                        resultadoAlistamento.setText("Você é menor de idade, ainda vai se alistar.");
                    } else if (idade == 18) {
                        resultadoAlistamento.setText("Você se alista esse ano.");
                    } else {
                        resultadoAlistamento.setText("Já passou o tempo de se alistar.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoAlistamento.setText("Digite um número válido!");
                }
            }
        });

        janelaAlistamento.setVisible(true);

        // Janela 2: Verificador de Notas
        JFrame janelaNotas = new JFrame("Verificador de Notas");
        janelaNotas.setSize(350, 200);
        janelaNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaNotas.setLayout(null);

        JTextField pontos = new JTextField();
        pontos.setBounds(50, 30, 230, 25);
        janelaNotas.add(pontos);

        JButton confirmar = new JButton("Verificar");
        confirmar.setBounds(100, 70, 120, 30);
        janelaNotas.add(confirmar);

        JLabel resultadoNotas = new JLabel("");
        resultadoNotas.setBounds(50, 120, 250, 25);
        janelaNotas.add(resultadoNotas);

        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = pontos.getText();
                try {
                    int nota = Integer.parseInt(texto);

                    if (nota != 0) {
                        resultadoNotas.setText("Você não tirou a maior nota.");
                        if (nota <= 4) {
                            resultadoNotas.setText("Você ficou com nota vermelha.");
                        } else if (nota >= 9) {
                            resultadoNotas.setText("Parabéns, você tirou uma ótima nota!");
                        } else {
                            resultadoNotas.setText("Você tirou nota azul.");
                        }
                    } else {
                        resultadoNotas.setText("Você tirou a menor nota, melhore.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoNotas.setText("Digite um número válido!");
                }
            }
        });

        janelaNotas.setVisible(true);
    }
}
