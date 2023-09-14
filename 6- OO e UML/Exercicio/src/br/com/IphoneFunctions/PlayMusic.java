package br.com.IphoneFunctions;

import java.util.List;
import java.util.ArrayList;

record PlayMusic(String nome) {

    public String getNome() {
        return nome;
    }
}

class BuscarMusica {
    private final List<PlayMusic> biblioteca;

    public BuscarMusica() {
        biblioteca = new ArrayList<>();
        biblioteca.add(new PlayMusic("AcDc  Back in Black"));
        biblioteca.add(new PlayMusic("Mamonas Assassinas  Pelados em Santos"));
        biblioteca.add(new PlayMusic("Janis Joplin  Maybe"));
    }

    public List<PlayMusic> buscar(String termo) {
        List<PlayMusic> resultado = new ArrayList<>();
        for (PlayMusic musica : biblioteca) {
            if (musica.getNome().toLowerCase().contains(termo.toLowerCase())) {
                resultado.add(musica);
            }
        }
        return resultado;
    }
}

class ReprodutorMusical {
    public void tocar(PlayMusic musica) {
        System.out.println("Tocando: " + musica.getNome());
    }

    public void pausar(PlayMusic musica) {
        System.out.println("Pausando: " + musica.getNome());
    }
}