import java.util.Scanner;

public class Aula_7_2_ExemploVetor {
    public static void main(String[] args) {
        //Declaraçao das variaveis:
        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media = 0;
        int j = 1;
        int i;

        //Entrada/Processamento:
        //for (int i = 0; i < 5; i++) {
        for (i = 0; i < 5; i++) {
            System.out.println("Entre com o nome do aluno(a) nº: "+(i+1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno(a) nº: "+(i+1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
            media = soma / j;
            j=j+1;
        }
        //media = soma / 5;

        //Saída:
        for (i = 0; i < 5; i++) {
            System.out.println("Nome do aluno(a) nº: "+(i+1));
            System.out.println(nomes[i]);
            System.out.println("Nota do aluno(a) nº: "+(i+1));
            System.out.println(notas[i]);
        }
        System.out.println("A soma é: "+soma);
        System.out.println("A média da turma é: "+ media);

    }
    
}