package com.desafiopoo.model;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private int capacidade;
    private String cor;
    
    public IPhone(String modelo, int capacidade, String cor) {
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.cor = cor;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
    	System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica(String musica) {
    	System.out.println("SELECIONANDO MUSICA");
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
    	System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
    	System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
    	System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
    	System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("ADCIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("ATUALIZANDO PAGINA");
    }
}

