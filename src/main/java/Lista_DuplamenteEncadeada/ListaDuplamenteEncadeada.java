package Lista_DuplamenteEncadeada;

public class ListaDuplamenteEncadeada {

    private Elemento inicio;

    public void adicionar(Pessoa p) {
        if (this.inicio == null) {
            this.inicio = new Elemento(p);
        } else {
            Elemento e = this.inicio;
            while (e.getProximo() != null) {
                e = e.getProximo();
            }
            e.setProximo(new Elemento(p));
            e.getProximo().setAnterior(e);
        }
    }

    public int tamanho() {
        if (this.inicio == null) {
            return 0;
        } else {
            int cont = 1;
            Elemento e = this.inicio;
            while (e.getProximo() != null) {
                cont++;
                e = e.getProximo();
            }
            return cont;
        }
    }

    public void adicionar(Pessoa p, int pos) {
        if (pos >= this.tamanho() || pos < 0) {
            this.adicionar(p);
        } else {
            if (pos == 0) {
                Elemento e = this.inicio;
                this.inicio = new Elemento(p);
                this.inicio.setProximo(e);
                this.inicio.setAnterior(null);
                e.setAnterior(this.inicio);
            } else {
                int cont = 0;
                Elemento e = this.inicio;
                while (cont < pos - 1) {
                    e = e.getProximo();
                    cont++;
                }
                Elemento proximo = e.getProximo();
                Elemento novo = new Elemento(p);
                e.setProximo(novo);
                novo.setProximo(proximo);
                proximo.setAnterior(novo);
                novo.setAnterior(e);

            }
        }
    }

    public void listar() {
        Elemento e = this.inicio;
        System.out.println(e.getPessoa());
        while (e.getProximo() != null) {
            e = e.getProximo();
            System.out.println(e.getPessoa());
        }
        while (e.getAnterior() != null) {
            e = e.getAnterior();
            System.out.println(e.getPessoa());
        }
    }

    public void remover(String nome) {
        Elemento e = this.inicio;
        if (e.getPessoa().getNome().equals(nome)) {
            this.inicio = e.getProximo();
            this.inicio.setAnterior(null);
        } else {
            while (e != null) {
                if (e.getPessoa().getNome().equals(nome)) {
                    e.getAnterior().setProximo(e.getProximo());
                    e.getProximo().setAnterior(e.getAnterior());
                } else {
                    e.getAnterior().setProximo(null);
                }
            }

        }
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

}
