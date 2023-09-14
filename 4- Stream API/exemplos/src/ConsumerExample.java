import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imaprimir números pares no Stream
        numeros.stream().filter(n -> n % 2 == 0)
        .forEach(n -> {
            if (n % 2 == 8) {
                System.out.println(n);
            }
        });
    }
}