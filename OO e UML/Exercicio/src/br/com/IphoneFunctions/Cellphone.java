package br.com.IphoneFunctions;

import java.util.List;
import java.util.Random;

public class Cellphone {

    public static void main(String[] args) {
        System.out.println("Inicializando *Phone");
        var buscador = new BuscarMusica();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Random random = new Random(); // Inicialize o gerador de números aleatórios aqui

        System.out.println("********************************************");
        System.out.println("Ouvir música");

        List<PlayMusic> resultados = buscador.buscar("");

        if (!resultados.isEmpty()) {
            int indiceAleatorio = random.nextInt(resultados.size());

            // Selecionar a música aleatória
            PlayMusic musicaSelecionada = resultados.get(indiceAleatorio);

            // Tocar a música selecionada
            reprodutor.tocar(musicaSelecionada);

            // Pausar a música
            reprodutor.pausar(musicaSelecionada);
        } else {
            System.out.println("Nenhuma música encontrada.");
        }

        System.out.println("********************************************");
        System.out.println("Realizar Chamada");
        MakeCalls makeCalls = new MakeCalls();

        makeCalls.buscarContato();
        makeCalls.fazerLigacao();
        makeCalls.atenderLigacao();
        makeCalls.encerrarLigacao();
        makeCalls.verificarCorreioVoz();

        System.out.println("********************************************");
        System.out.println("Abrir navegador");
        Browser browser = new Browser();

        browser.abrirNovaAba();

        browser.visualizarAba(0);
        browser.buscarNoNavegador("Pesquisa");

        browser.atualizarAba();
        browser.encerrarNavegador();
    }
}
