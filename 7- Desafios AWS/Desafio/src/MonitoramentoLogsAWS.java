import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
        }
        // Encontrar o serviço com a maior quantidade de eventos
        Map.Entry<String, Long> maiorServico = eventosPorServico.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NoSuchElementException::new);

        // Encontrar o serviço com a menor quantidade de eventos
        Map.Entry<String, Long> menorServico = eventosPorServico.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .orElseThrow(NoSuchElementException::new);

        // Imprimir os resultados
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Maior:" + maiorServico.getKey());
        System.out.println("Menor:" + menorServico.getKey());
    }
}