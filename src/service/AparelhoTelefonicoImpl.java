package service;

import model.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    private boolean chamadaAtiva = false;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
        chamadaAtiva = true;
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}