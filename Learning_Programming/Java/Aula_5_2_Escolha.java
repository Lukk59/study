import java.util.Scanner;

public class Aula_5_2_Escolha{
    public static void main(String[] args) {
        
        //Declaraçao das variaveis:
        int op;
        float num = 0, resultado;

        //Entrada:
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Opções:");
        System.out.println ("1 - Calcular o dobro do número.");
        System.out.println ("2 - Calcular o triplo do número.");
        System.out.println ("Escolha uma opção: ");
        op = entrada.nextInt();
        System.out.println ("Digite um número: ");
        num = entrada.nextFloat();

        //Processamento/Saída:
        switch(op){
            case 1:
                resultado = num*2;
                System.out.println("Dobro: " + resultado);
                break;
            case 2:
                resultado = num*3;
                System.out.println("Triplo: " + resultado);
                break;        
        }
      
    }
}
