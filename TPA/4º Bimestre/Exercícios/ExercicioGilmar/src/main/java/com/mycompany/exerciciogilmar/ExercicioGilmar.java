package com.mycompany.exerciciogilmar;
import java.util.Scanner;
public class ExercicioGilmar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matrizes");
        
        String[][] Matriz = new String[3][4];
        
        Matriz[0][0] = "Nome";
        Matriz[0][1] = "nota1";
        Matriz[0][2] = "nota2";
        Matriz[0][3] = "media";
        
        for(int i = 1; i < Matriz.length; i++){
            System.out.println("Aluno "+i);
            System.out.print("Digite o Nome: ");
            Matriz[i][0] = scan.nextLine();
                
            System.out.print("Digite a nota 1: ");
            Matriz[i][1] = scan.nextLine();
            
            System.out.print("Digite a nota 2: ");
            Matriz[i][2] = scan.nextLine();
            
            double media = (Double.valueOf(Matriz[i][1]) + Double.valueOf(Matriz[i][2]))/2;
            Matriz[i][3] = String.valueOf(media);
        }
        
        for(int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                System.out.printf("| %-6s", Matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
}
