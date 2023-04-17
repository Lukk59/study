import java.util.Scanner;

public class Aula_5_1_NumMaior2{
    public static void main(String[] args) {
        
        //Declaraçao das variaveis:
        int num1, num2;

        //Entrada:
        Scanner ler = new Scanner(System.in);
        System.out.printf("Escreva um número:\n");
        num1 = ler.nextInt();
        System.out.printf("Escreva outro número:\n");
        num2 = ler.nextInt();

        //Processamento/Saída::
        if(num1 > num2) {
            System.out.println("O primeiro número é o maior.");
        }
        else {
            System.out.println("O segundo número é o maior.");
        }
      
    }
}
