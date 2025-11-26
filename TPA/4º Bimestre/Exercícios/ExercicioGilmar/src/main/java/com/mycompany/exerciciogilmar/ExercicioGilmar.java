package com.mycompany.exerciciogilmar;
import java.util.Scanner;
public class ExercicioGilmar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matrizes");
        
        String[][] Matriz = new String[3][4];
        
        for(int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                System.out.print("Digite o valor ");
                Matriz[i][j] = scan.nextLine();
            }
        }
        
        for(int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                System.out.printf("| %-6s", Matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
