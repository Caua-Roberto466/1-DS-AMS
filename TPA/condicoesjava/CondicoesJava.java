package com.mycompany.condicoesjava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CondicoesJava {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Verificador de Alistamento");
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        // Campo para digitar a idade
        JTextField campoIdade = new JTextField();
        campoIdade.setBounds(50, 30, 230, 25);
        janela.add(campoIdade);

        // Botão para verificar
        JButton botaoVerificar = new JButton("Verificar");
        botaoVerificar.setBounds(100, 70, 120, 30);
        janela.add(botaoVerificar);

        // Área de texto para o resultado
        JLabel resultado = new JLabel("");
        resultado.setBounds(50, 120, 250, 25);
        janela.add(resultado);

        // O que acontece quando o botão é clicado
        botaoVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoIdade.getText();
                try {
                    int idade = Integer.parseInt(texto);

                    if (idade < 18) {
                        resultado.setText("Você é menor de idade, ainda vai se alistar.");
                    } else if (idade == 18) {
                        resultado.setText("Você se alista esse ano.");
                    } else {
                        resultado.setText("Já passou o tempo de se alistar.");
                    }
                } catch (NumberFormatException ex) {
                    resultado.setText("Digite um número válido!");
                }
            }
        });

        // Mostrar a janela
        janela.setVisible(true);
    }
}
