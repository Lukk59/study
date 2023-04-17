import java.util.Scanner;

public class Aula_4_EntradaProcSaida{
    public static void main(String[] args) {
        
        //Declaraçao das variaveis:
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float resultadoSoma;
        float resultadoMedia;

        //Entrada:
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o primeiro número:\n");
        num1 = ler.nextInt();
        System.out.printf("Informe o segundo número:\n");
        num2 = ler.nextInt();
        System.out.printf("Informe o terceiro número:\n");
        num3 = ler.nextInt();

        //Calculos/Processamento:
        resultadoSoma = num1 + num2 + num3;
        resultadoMedia = resultadoSoma/3;

        //Mostrar na tela/Saída:
        System.out.println("Os números são:");
        System.out.println("Primeiro: ");
        System.out.println(num1);
        System.out.println("Segundo: ");
        System.out.println(num2);
        System.out.println("Terceiro: ");
        System.out.println(num3);
        System.out.println("Resultado da soma: ");
        System.out.println(resultadoSoma);
        System.out.println("Resultado da media: ");
        System.out.println(resultadoMedia);
      
    }
}
