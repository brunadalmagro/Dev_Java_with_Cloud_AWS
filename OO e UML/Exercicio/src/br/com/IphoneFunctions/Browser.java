package br.com.IphoneFunctions;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Bruna
 */

public class Browser {
        private final List<String> abasAbertas;
        private int abaAtual;

        public Browser() {
            abasAbertas = new ArrayList<>();
            abaAtual = -1; // Nenhuma aba aberta inicialmente
        }

        public void visualizarAba(int indice) {
            if (indice >= 0 && indice < abasAbertas.size()) {
                abaAtual = indice;
                System.out.println("Visualizando a aba " + (indice + 1));
            } else {
                System.out.println("Aba inválida.");
            }
        }

        public void buscarNoNavegador(String termo) {
            if (abaAtual != -1) {
                System.out.println("Buscando por '" + termo + "' na aba " + (abaAtual + 1));
            } else {
                System.out.println("Nenhuma aba aberta para realizar a busca.");
            }
        }

        public void atualizarAba() {
            if (abaAtual != -1) {
                System.out.println("Atualizando a aba " + (abaAtual + 1));
            } else {
                System.out.println("Nenhuma aba aberta para atualizar.");
            }
        }

        public void encerrarNavegador() {
            abasAbertas.clear();
            abaAtual = -1;
            System.out.println("Navegador encerrado.");
        }

        public void abrirNovaAba() {
            abasAbertas.add("Nova aba");
            abaAtual = abasAbertas.size() - 1;
            System.out.println("Aba aberta: Nova aba");
        }
    }
