package com.mycompany.trabalhandocommatrizes;

import java.util.Scanner;
public class TrabalhandoComMatrizes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ///Exercício 1
        System.out.println("Exercícios de Matriz");
        int[][] matriz_pares = new int [4][4];
        int soma_par = 0;
        int controle_par = 0;
        
        //Pegando os números
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o " + (j+1) + " número da " + (i+1) + " linha");
                matriz_pares[i][j] = scan.nextInt();
            }
        }
        
        //Calculando os pares
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matriz_pares[i][j] % 2 == 0){
                    soma_par += matriz_pares[i][j];
                    controle_par++;
                }
            }
        }
        double media_par = soma_par / controle_par;
        System.out.println("A soma dos números pares deu: "+ soma_par +" e a média deu: "+ media_par);
        
        System.out.println();
        System.out.println();
        
        //Exercício 2
        char[][] matriz_letras = new char[4][5];
        int[][] matriz_inteiros = new int[3][4];
        double[][] matriz_racionais = new double[3][3];
        
        //Valores das letras
        System.out.println("Matriz de letras\n");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite a " +(j+1)+ " letra da "+(i+1)+" linha: ");
                matriz_letras[i][j] = scan.next().charAt(0);
            }
        }
        //Exibindo valores das letras
        System.out.println("a)");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_letras[i][j] + "   ");
            }
            System.out.println("");
        }
        
        //Valores dos inteiros
        System.out.println("Matriz de inteiros \n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o "+(j+1) +" número da "+(i+1)+" linha: ");
                matriz_inteiros[i][j] = scan.nextInt();
            }
        }
        
        //Exibindo valores
        System.out.println("b)");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz_inteiros[i][j]+"   ");
            }
            System.out.println("");
        }
        
        
        
        //Valores racionais
        System.out.println("Matriz de racionais \n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite o "+(j+1) +" número da "+(i+1)+" linha: ");
                matriz_racionais[i][j] = scan.nextDouble();
            }
        }
        
        //Exibindo valores
        System.out.println("c)");
        for(int i = 0; i <3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz_racionais[i][j] + "   ");
            }
            System.out.println("");
        }
        
        System.out.println("\n \n");
        
        //Exercício 3
        
        //Matiz impar e somar tudo
        int[][] matriz_impar = new int[5][5];
        int soma_impar= 0;
        int soma_linha1 = 0;
        int soma_coluna1 = 0;
        int soma_linha2 = 0;
        int soma_coluna2 = 0;
        int soma_linha3 = 0;
        int soma_coluna3 = 0;
        int soma_linha4 = 0;
        int soma_coluna4 = 0;
        int soma_linha5 = 0;
        int soma_coluna5 = 0;
        
        //Coletando valores
        System.out.println("\nSomando números impar");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o "+(j+1)+" número da "+(i+1)+" linha ");
                matriz_impar[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_impar[i][j]+"   ");
            }
            System.out.println("");
        }
        
        //Somando os impares
        for(int i =0; i<5;i++){
            for(int j = 0; j< 5; j++){
                if(matriz_impar[i][j] % 2 != 0){
                    soma_impar += matriz_impar[i][j];
                }
            }
        }
        
        System.out.println("A soma dos números impares é "+soma_impar);
        
        //Somando linha 1
        for(int i = 0; i < 5; i++){
            soma_linha1 += matriz_impar[0][i];
        }
        
        //Linha 2
        for(int i = 0; i < 5; i++){
            soma_linha2 += matriz_impar[1][i];
        }
        
        //Linha 3
        for(int i = 0; i < 5; i++){
            soma_linha3 += matriz_impar[2][i];
        }
        
        //Linha 4
        for(int i = 0; i < 5; i++){
            soma_linha4 += matriz_impar[3][i];
        }
        
        //Linha 5
        for(int i = 0; i < 5; i++){
            soma_linha5 += matriz_impar[4][i];
        }
        
        //Coluna 1
        for(int i = 0; i < 5; i++){
            soma_coluna1 += matriz_impar[i][0];
        }
        
        //Coluna 2
        for(int i = 0; i < 5; i++){
            soma_coluna2 += matriz_impar[i][1];
        }
        
        //Coluna 3
        for(int i = 0; i < 5; i++){
            soma_coluna3 += matriz_impar[i][2];
        }
        
        //Coluna 4
        for(int i = 0; i < 5; i++){
            soma_coluna4 += matriz_impar[i][4];
        }
        
        //Coluna 5
        for(int i = 0; i < 5; i++){
            soma_coluna5 += matriz_impar[i][4];
        }
        
        System.out.printf("\na soma da linha 1 é: %d \na soma da linha 2 é: %d \na soma da linha 3 é: %d \na soma da linha 4 é: %d \na soma da linha 5 é: %d", soma_linha1, soma_linha2, soma_linha3, soma_linha4, soma_linha5);
        System.out.printf("\na soma da coluna 1 é: %d \na soma da coluna 2 é: %d \na soma da coluna 3 é: %d \na soma da coluna 4 é: %d \na soma da coluna 5 é: %d", soma_coluna1, soma_coluna2, soma_coluna3, soma_coluna4, soma_coluna5);
    
        System.out.println("\n\n");
        //Exercício 4
        int quanti_par = 0;
        int quanti_impar = 0;
        int[][] matriz_ex4 = new int[3][5];
        
        //Atribuindo valor
        System.out.println("\nAnalisando matiz");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o "+(j+1)+" número da "+(i+1)+" linha ");
                matriz_ex4[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_ex4[i][j]+"   ");
            }
            System.out.println("");
        }
        
        //Tem ou não repetido
        boolean repetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                int atual = matriz_ex4[i][j];

                // compara com todos os outros
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {
                    
                        // evita comparar o elemento com ele mesmo
                        if (i == x && j == y) continue;
                    
                        if (atual == matriz_ex4[x][y]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (repetido) break;
                }
                if (repetido) break;
            }
        }

        if (repetido) {
            System.out.println("A matriz tem elementos repetidos!");
        } else {
            System.out.println("A matriz NÃO tem elementos repetidos.");
        }

        
        //Pares e Impares
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if(matriz_ex4[i][j] % 2 == 0){
                    quanti_par++;
                }else{
                    quanti_impar++;
                }
            }
        }
        System.out.printf("\nTem %d números pares e %d números impares", quanti_par, quanti_impar);
        
        
        //Exercício 5
        System.out.println("\n\n");
        
        double[][] matriz_diagonal = new double[4][4];
        System.out.println("\nExibindo diagonais");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o "+(j+1)+" número da "+(i+1)+" linha ");
                matriz_diagonal[i][j] = scan.nextDouble();
            }
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz_diagonal[i][j]+"   ");
            }
            System.out.println("");
        }
        
        //Diagonal principal
        for(int i = 0; i < 4; i++){
            System.out.print(matriz_diagonal[i][i]+"   ");
        }
        
        System.out.println("\n");
        //Diagonal decundária
        for(int i = 0; i < 4; i++){
            System.out.print(matriz_diagonal[i][4 - 1 - i]+"");
        }
        
        //Exercício 6
        System.out.println("\n\n");
        char[][] char1 = new char[3][3];
        char[][] char2 = new char[4][4];
        char[][] char3 = new char[4][4];
        //Figura a
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 || i == 2 || j == 0 || j == 2){
                    char1[i][j] = '*';
                }else{
                    char1[i][j] = ' ';
                }
            }
        }
        
        //Exibindo figura a
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(char1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //Figura b
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 || i == 3 || j == 0 || j == 3){
                    char2[i][j] = '*';
                }else{
                    char2[i][j] = ' ';
                }
            }
        }
        
        //Exibindo figura b
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(char2[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        //FIgura c
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j <= i){
                    char3[i][j] = '*';
                }else{
                    char3[i][j] = ' ';
                }
            }
        }
        //Exibindo figura 
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(char3[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
