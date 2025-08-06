package com.mycompany.condicoes2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Condicoes2 {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Verificador de notas"); //Cria a janela onde ficará as informações
        janela.setSize(350, 200); //Define o tamanho
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se a pessoa fechar a janela o prgrama encerra
        janela.setLayout(null); //Deixa o layout livre

        // Campo para digitar a idade
        JTextField pontos = new JTextField(); //Cria o campo de texto que pega a informação
        pontos.setBounds(50, 30, 230, 25); //Define o tamanho do campo de texto
        janela.add(pontos); //Adiciona o campo de texto na janela

        // Botão para verificar
        JButton confirmar = new JButton("Verificar"); //Cria o botão que vai enviar as informações
        confirmar.setBounds(100, 70, 120, 30);  //Define o tamanho do botão
        janela.add(confirmar); //Adiciona o botão na janela

        // Área de texto para o resultado
        JLabel resultado = new JLabel(""); //Cria um espaço onde vai ficar a resposta
        resultado.setBounds(50, 120, 250, 25);  //Define o tamanho do espaço da resposta
        janela.add(resultado); //Adiciona o espaço da mensagem na janela

        // O que acontece quando o botão é clicado
        confirmar.addActionListener(new ActionListener() { //Vai adicionar uma ação quano o botão for clicado
            @Override
            public void actionPerformed(ActionEvent e) { //Da a ação de clicar no botão
                String texto = pontos.getText(); //Guara o valor digitado pelo usuário
                try { 
                    int nota = Integer.parseInt(texto);

                    if (nota != 0) { /*Se o valor digitado for diferente de zero, ele da a mensagem de que não tirou a menor nota */
                        resultado.setText("Você não tirou a maior nota.");
                        if (nota <= 4) { /*Se for menor ou igual a 4, fala que tirou nota vermelha*/
                            resultado.setText("Você ficou com nota vermelha.");
                        } else if (nota >= 9){
                            resultado.setText("parabéns, você tirou uma ótima nota");
                        }else if (nota > 4) {  /*Se for maior que quatro fala que el ficou com azul*/
                            resultado.setText("Você tirou nota azul."); /*Se for 9 ou 10 fala que ele teve uma ótima nota*/
                        }
                    }else{
                        resultado.setText("Você tirou a menor nota, melhore");
                    }
                } catch (NumberFormatException ex) { //aparece essa mensagem se o valor digitado não for um número
                    resultado.setText("Digite um número válido!");
                }
            }
        });

        // Mostrar a janela
        janela.setVisible(true);
    }
}
