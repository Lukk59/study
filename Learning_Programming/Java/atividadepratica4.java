//salvar como Programa_PeR4.java
import javax.swing.*;

class Programa_PeR4
{
    public static void main (String entrada[]) 
    {
        //declarar variavel:
        int n1, n2, mod;
        double pot;
        String msg="";

        //entrada de dados:
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva outro numero inteiro: "));

        //processamento:
        mod = n1 / n2;
        pot = Math.pow(n1, n2);

        //saida de resultados:
        msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}