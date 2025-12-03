import java.util.Scanner;
public class exercicio{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sistema de armazenamento");
        String[][] estoque = new String[3][4];

        estoque[0][0] = "Produto";
        estoque[0][1] = "Quantidade";
        estoque[0][2] = "Preço";
        estoque[0][3] = "Valor total";

        for(int i = 1; i < estoque.length; i++){
        System.out.println("Produto "+(i));

        System.out.print("Digite o produto: ");
        estoque[i][0] = scan.nextLine();

        System.out.print("Digite a quantidade: ");
        estoque[i][1] = scan.nextLine();

        System.out.print("Digite o preço: ");
        estoque[i][2] = scan.nextLine();
        
        double valor_final = Double.valueOf(estoque[i][1]) * Double.valueOf(estoque[i][2]);
        estoque[i][3] = String.valueOf(valor_final);
        }

        for(int i = 0; i < estoque.length; i++){
            for(int j = 0; j < estoque[i].length; j++){
                    System.out.printf("%-10s ", estoque[i][j]);
            }
            System.out.println();
        }
    }
}