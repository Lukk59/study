import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();

       Scanner scanner = new Scanner(System.in);

       int total = 0;

       while (true) {

           System.out.println("Digite um numero inteiro (digite 00 para finalizar) :");

           int num = scanner.nextInt();

           if (num == 00) {

               break;

           }

           numbers.add(num);

           total += num;

       }

       System.out.println("Numeros armazenados: " + numbers);

       System.out.println("Soma total dos numeros: " + total);

   }

}