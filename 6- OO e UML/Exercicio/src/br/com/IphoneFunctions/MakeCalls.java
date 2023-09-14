package br.com.IphoneFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

record Contato(String nome, String numero) {

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}

public class MakeCalls {
    private final List<Contato> listaContatos;
    private String chamadaAtual;

    public MakeCalls() {
        listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Amigo 1", "123-456-7890"));
        listaContatos.add(new Contato("Amigo 2", "987-654-3210"));
        listaContatos.add(new Contato("Amigo 3", "555-555-5555"));
        chamadaAtual = null;
    }

    public void buscarContato() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaContatos.size());
        Contato contatoSelecionado = listaContatos.get(indiceAleatorio);
        System.out.println("Chamando " + contatoSelecionado.getNome() + " (" + contatoSelecionado.getNumero() + ")");
        chamadaAtual = contatoSelecionado.getNome();
    }

    public void fazerLigacao() {
        if (chamadaAtual != null) {
            System.out.println("Ligação em andamento para " + chamadaAtual);
        } else {
            System.out.println("Nenhuma chamada em andamento.");
        }
    }

    public void atenderLigacao() {
        if (chamadaAtual != null) {
            System.out.println("Chamada em andamento");
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    public void encerrarLigacao() {
        if (chamadaAtual != null) {
            System.out.println("Encerrando chamada com " + chamadaAtual);
            chamadaAtual = null;
        } else {
            System.out.println("Nenhuma chamada em andamento.");
        }
    }

    public void verificarCorreioVoz() {
        System.out.println("Verificando correio de voz...");
    }

    public static void main(String[] args) {
        MakeCalls makeCalls = new MakeCalls();

        makeCalls.buscarContato();
        makeCalls.fazerLigacao();
        makeCalls.atenderLigacao();
        makeCalls.encerrarLigacao();
        makeCalls.verificarCorreioVoz();
    }
}
