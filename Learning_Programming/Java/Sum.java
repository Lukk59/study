import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        // int result = exercise(0, 0);
        // System.out.print(result);
        pr10();
    }

    public static void pr10() {
        List<String> objetos = Arrays.asList("garrafa", "copo", "litro");
        for (int tam = objetos.size() - 1; tam >= 0; tam--) {
            System.out.print(objetos.get(tam) + ",");
        }
    }
}