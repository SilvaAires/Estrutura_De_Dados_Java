package Listas_Encadeadas_Simples;

public class ListaEncadeada {

    private Elemento inicio;
    private int tam;

    public ListaEncadeada() {
        this.inicio = null;
        this.tam = 0;
    }

    public boolean remover(String cpf) {
        Elemento e = this.inicio;
        if (e.getPessoa().getCpf().equals(cpf)) {
            this.inicio = e.getProximo();
            return true;
        } else {
            while (e.getProximo() != null) {
                if (e.getProximo().getPessoa().getCpf().equals(cpf)) {
                    e.setProximo(e.getProximo().getProximo());
                    return true;
                } else {
                    e = e.getProximo();
                }
            }
        }
        return false;
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
    
    // adicionado 03/04 novo
    
    public void addIn ( Pessoa p, int pos){
        if (pos > this.tam){
            adicionar(p);
        }
        else{
            if (pos == 0){
                Elemento el = this.inicio;
                this.inicio = new Elemento(p);
                this.inicio.setProximo(el);
            }
            else{
                int pos1 = 0;
                Elemento el = this.inicio;
                while (pos1 < pos-1){
                    el = el.getProximo();
                    pos++;
                }
                Elemento proximo = el.getProximo();
                el.setProximo(new Elemento(p));
                el.getProximo().setProximo(proximo);
            }
            this.tam++;
        }
    }
    
    public void listaIndex(int indice){
        if(indice > this.tam){
            System.out.println("Erro, não existe.");
            return;
        }
        if(this.inicio != null){
            int pos = 0;
            Elemento e = this.inicio;
            while (pos < indice){
                if(pos != indice){
                    e = e.getProximo();
                    pos++;
                }
            }
            System.out.println(e);
        }
        else{
            System.out.println("Lista vazia.");
        }
    }
    
    // adicionado 03/04 novo pdf
    
    public void pesquisa(String valor) {
        if (this.vazia()) {
            System.out.println("Erro 1");
        }
        Elemento aux = this.inicio;

        while (aux.getProximo() != null) {
            if (aux.getPessoa().getCpf().equals(valor)) {
                System.out.println(aux.getProximo().getPessoa());
            }
            aux = aux.getProximo();
        }
        System.out.println("Erro 2");
    }
    
    public void imprime() {
        System.out.println("- - - i t e n s - - -");
        Elemento aux = this.inicio.getProximo();
        while (aux != null) {
            System.out.println(aux.getPessoa());
            aux = aux.getProximo();
        }
        System.out.println("- - - -");
    }
    
    /*public void Ordena() {
        Elemento aux = this.inicio.getProximo();
        while (aux != null) {
            Elemento prox = aux.getProximo();
            while (prox != null) {
                if (aux.getPessoa().getCpf() > prox.getPessoa().getCpf()) {
                    Pessoa s = aux.getPessoa();
                    aux.getPessoa() = prox.getPessoa();
                    prox.getPessoa() = s;
                }
                prox = prox.getProximo();
            }
            aux = aux.getProximo();
        }
    }
    public void OrdenaDesc() {
        No aux = this.primeiro.prox;
        while (aux != null) {
            No prox = aux.prox;
            while (prox != null) {
                if (aux.valor < prox.valor) {
                    int s = aux.valor;
                    aux.valor = prox.valor;
                    prox.valor = s;
                }
                prox = prox.prox;
            }
            aux = aux.prox;
        }
    }*/
}
