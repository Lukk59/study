import java.util.Scanner;

public class Soma_e_media_de_3{

    public static void main(String[] args) {
        
        //declarar variavel:
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float resultadoSoma;
        float resultadoMedia;


            //entrada de dados:
            Scanner ler = new Scanner(System.in);
            System.out.printf("Infore o primeiro número:\n");
            num1 = ler.nextInt();
            System.out.printf("Infore o segundo número:\n");
            num2 = ler.nextInt();
            System.out.printf("Infore o terceiro número:\n");
            num3 = ler.nextInt();

            //processamento:
            resultadoSoma = num1 + num2 + num3;
            resultadoMedia = resultadoSoma/3;

            //saida de resultados:
            System.out.println("Os números são:");
            System.out.print("Primeiro: ");
            System.out.println(num1);
            System.out.print("Segundo: ");
            System.out.println(num2);
            System.out.print("Terceiro: ");
            System.out.println(num3);
            System.out.println("Resultado da Soma:");  
            System.out.println(resultadoSoma);
            System.out.println("Resultado da Média:");
            System.out.println(resultadoMedia);    
    }
}
