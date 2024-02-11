package Trabalho_de_ListaEncadeada;

public class Elemento {

    private Pessoa p;
    private Elemento proximo;

    public Elemento(Pessoa p) {
        this.p = p;
    }

    public Elemento() {
    }

    public Pessoa getPessoa() {
        return this.p;
    }

    public void setPessoa(Pessoa p) {
        this.p = p;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String toString() {
        return this.p.toString();
    }
}




