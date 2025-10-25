package com.mycompany.calculandomatrizes;
import java.util.Scanner;
public class CalculandoMatrizes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Cria as matrizes
        int[][] matriz_A = new int [5][5];
        int[][] matriz_B = new int [5][5];
        int[][] matriz_C = new int [5][5];
        
        //Atribui os valores para as matrizes
        System.out.println("Valores da Matriz A");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o Número "+ (j+ 1) + " da coluna " + (i + 1) +": ");
                matriz_A[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Valores da Matriz B");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o Número "+ (j+ 1) + " da coluna " + (i + 1) +": ");
                matriz_B[i][j] = scan.nextInt();
            }
        }
        
        //Calculando a matriz C
        //Soma
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz_C[i][j] = matriz_A[i][j] + matriz_B[i][j]; 
            }
        }
        System.out.println("Soma da Matriz C");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_C[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Subtração
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz_C[i][j] = matriz_A[i][j] - matriz_B[i][j]; 
            }
        }
        System.out.println("Subtração da Matriz C");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_C[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Multiplicação
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz_C[i][j] = matriz_A[i][j] * matriz_B[i][j]; 
            }
        }
        System.out.println("Multiplicação da Matriz C");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_C[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Divisão
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz_C[i][j] = matriz_A[i][j] / matriz_B[i][j]; 
            }
        }
        System.out.println("DIvisão da Matriz C");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz_C[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
