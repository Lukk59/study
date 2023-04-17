public class Aula_3_Soma_e_media{
    public static void main(String[] args) {
        
        //Declaraçao das variaveis:
        String nomeAlg;
        int resultadoSoma;
        float resultadoMedia;
        float resultadoMedia2;


        //Calculos:
        nomeAlg = "Soma e media";
        resultadoSoma = 5+5+5;
        resultadoMedia = (5+5+5)/3;
        //ou:
        resultadoSoma = 5+5+5;
        resultadoMedia2 = resultadoSoma/3;

        //Mostrar na tela:
        System.out.println("Soma e media dos numeros 5, 5 e 5");
        System.out.println("Nome do algoritimo: ");
        System.out.println(nomeAlg);
        System.out.println("Resultado da soma: ");
        System.out.println(resultadoSoma);
        System.out.println("Resultado da media: ");
        System.out.println(resultadoMedia);
        System.out.println("Resultado da media2: ");
        System.out.println(resultadoMedia2); 
      
    }
}
