package Trabalho_de_ListaEncadeada;

public class ListaEncadeada {
    private Elemento inicio;
    
    public ListaEncadeada() {
        this.inicio = null;
    }
    
    public void adicionar(Pessoa p) {
        if (this.inicio == null) {
            this.inicio = new Elemento(p);
        } else {
            Elemento elemento = this.inicio;
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(p));
        }
    }
    
    public boolean vazia() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }
    
    public void listar() {
        if (!this.vazia()) {
            Elemento elemento = this.inicio;
            System.out.println(elemento);
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
                System.out.println(elemento);
            }
        }
    }

    public boolean remover(String nome) {
        Elemento e = this.inicio;
        if (e.getPessoa().getNome().equals(nome)) {
            this.inicio = e.getProximo();
            return true;
        } else {
            while (e.getProximo() != null) {
                if (e.getProximo().getPessoa().getNome().equals(nome)) {
                    e.setProximo(e.getProximo().getProximo());
                    return true;
                } else {
                    e = e.getProximo();
                }
            }
        }
        return false;
    }
    
    public int tamanho() {
        int tam = 0;
        if (!this.vazia()) {
            Elemento elemento = this.inicio;
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
                tam ++;
            }
        }
        return tam;
    }
    
    public Pessoa buscar(String nome){
        Elemento e = this.inicio;
        if (e.getPessoa().getNome().equals(nome)) {
            this.inicio = e.getProximo();
            return e.getPessoa();
        } else {
            while (e.getProximo() != null) {
                if (e.getProximo().getPessoa().getNome().equals(nome)) {
                    return e.getProximo().getPessoa();
                } else {
                    e = e.getProximo();
                }
            }
        }
        return e.getPessoa();
    }

    public void pesquisa(String valor) {
        if (this.vazia()) {
            System.out.println("Erro 1");
        }
        Elemento aux = this.inicio;

        while (aux.getProximo() != null) {
            if (aux.getPessoa().getNome().equals(valor)) {
                System.out.println(aux.getProximo().getPessoa());
            }
            aux = aux.getProximo();
        }
        System.out.println("Erro 2");
    }

}