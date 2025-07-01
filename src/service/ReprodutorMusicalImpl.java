package service;

import model.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

    private String musicaAtual;
    private boolean tocando;

    @Override
    public void tocar() {
        if (musicaAtual == null || musicaAtual.isEmpty()) {
            System.out.println("Nenhuma música selecionada para tocar.");
            return;
        }
        tocando = true;
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        if (!tocando) {
            System.out.println("Nenhuma música está tocando.");
            return;
        }
        tocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}