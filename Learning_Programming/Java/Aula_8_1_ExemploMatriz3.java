import java.util.Scanner;

public class Aula_8_1_ExemploMatriz3 {
    public static void main(String[] args) {
        //Declaraçao das variaveis:
        int numeros [][] = new int[3][2];
        int soma=1;

        //Entrada/Processamento:
        //Laços para percorrer linhas:
        for (int i = 0; i < 3; i++) {
            //Laço para percorrer colunas:
            for (int j = 0; j < 2; j++) {
                soma = soma+2;
                numeros[i][j] = soma;
            }
        }
        //Saída:
        for (int i = 0; i < 3; i++) {
            //Laços para percorrer colunas:
            for (int j = 0; j < 2; j++) {
                System.out.println("Valores para a linha "+ (i+1) + " e coluna " + (j+1) +": ");
                System.out.println(numeros[i][j]);
            }
        }
        System.out.println("Fim da execução.");

    }
    
}