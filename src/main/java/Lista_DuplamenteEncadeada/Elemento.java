package Lista_DuplamenteEncadeada;

public class Elemento {
    private Pessoa p;
    private Elemento proximo;
    private Elemento anterior;

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

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
