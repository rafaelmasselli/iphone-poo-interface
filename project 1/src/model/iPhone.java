package model;
import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String numeroTelefone;
    private String musicaAtual;

    public iPhone(String numero) {
        this.numeroTelefone = numero;
        this.musicaAtual = null;
    }

    @Override
    public void tocarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pararMusica() {
        if (musicaAtual != null) {
            System.out.println("Parando música: " + musicaAtual);
            musicaAtual = null;
        } else {
            System.out.println("Nenhuma música em reprodução.");
        }
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    @Override
    public void receberLigacao() {
        System.out.println("Recebendo ligação...");
    }

    @Override
    public void navegarInternet(String url) {
        System.out.println("Navegando na internet para: " + url);
    }
}