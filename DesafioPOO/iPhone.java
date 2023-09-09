package DesafioPOO;

public class iPhone implements Reprodutor, Telefone, Navegador {

    private Reprodutor reprodutorMusical;
    private Telefone aparelhoTelefonico;
    private Navegador navegadorWeb;

    public iPhone(Reprodutor reprodutorMusical, Telefone aparelhoTelefonico, Navegador navegadorWeb) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorWeb = navegadorWeb;
    }

    // Implementação dos métodos da interface Reprodutor
    @Override
    public void reproduzirMusica() {
        reprodutorMusical.reproduzirMusica();
    }

    @Override
    public void pausarMusica() {
        reprodutorMusical.pausarMusica();
    }

    @Override
    public void avancarFaixa() {
        reprodutorMusical.avancarFaixa();
    }

    @Override
    public void retrocederFaixa() {
        reprodutorMusical.retrocederFaixa();
    }

    // Implementação dos métodos da interface Telefone
    @Override
    public void fazerChamada(String numero) {
        aparelhoTelefonico.fazerChamada(numero);
    }

    @Override
    public void receberChamada() {
        aparelhoTelefonico.receberChamada();
    }

    @Override
    public void encerrarChamada() {
        aparelhoTelefonico.encerrarChamada();
    }

    // Implementação dos métodos da interface Navegador
    @Override
    public void abrirURL(String url) {
        navegadorWeb.abrirURL(url);
    }

    @Override
    public void fecharURL() {
        navegadorWeb.fecharURL();
    }

    @Override
    public void navegarAtras() {
        navegadorWeb.navegarAtras();
    }

    @Override
    public void navegarAdiante() {
        navegadorWeb.navegarAdiante();
    }
}
