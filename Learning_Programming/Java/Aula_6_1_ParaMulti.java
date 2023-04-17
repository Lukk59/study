import java.util.Scanner;

public class Aula_6_1_ParaMulti {
    public static void main(String[] args) {
        //Declaraçao das variaveis:
        int multi = 1;
        int i, num = 0;

        //Entrada/Processamento:
        Scanner ler = new Scanner(System.in);
        for (i = 1; i <= 5; ++i) {
            System.out.println("Digite um número do tipo inteiro para a Multiplicação: ");
            num = ler.nextInt();
            multi=multi*num;
            System.out.println("Resultado: ");
            System.out.println(multi);
        }

        //Saída:
        System.out.print("Resultado da Multiplicação: ");
        System.out.println(multi);



    }
    
}
