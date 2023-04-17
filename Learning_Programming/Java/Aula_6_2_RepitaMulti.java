import java.util.Scanner;

public class Aula_6_2_RepitaMulti {
    public static void main(String[] args) {
        //Declaraçao das variaveis:
        int multi = 1;
        int i = 1;
        int num = 0;

        //Entrada/Processamento:
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Digite um número do tipo inteiro para a Multiplicação: ");
            num = ler.nextInt();
            multi=multi*num;
            System.out.println("Resultado: ");
            System.out.println(multi);
            i = i + 1;
        } while (i <=5);

        //Saída:
        System.out.print("Resultado da Multiplicação: ");
        System.out.println(multi);



    }
    
}
