package Lista_Circular;

public class ListaCircular {
    private Elemento inicio;
    
    public void add (Pessoa p){
        if (this.inicio == null){
            this.inicio = new Elemento(p);
            this.inicio.setProximo(this.inicio);
        }else{
            Elemento e = this.inicio;
            while (!e.getProximo().getPessoa().equals(this.inicio.getPessoa())){
                e = e.getProximo();
            }
            e.setProximo(new Elemento(p));
            e.getProximo().setProximo(this.inicio);
        }
    }
    
    public void adicionar(Pessoa p, int pos) {
        if (pos >= this.tamanho() || pos < 0) {
            this.add(p);
        } else {
            if (pos == 0) {
                Elemento e = this.inicio;
                this.inicio = new Elemento(p);
                this.inicio.setProximo(e);
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
            }
        }
    }
    
    public int tamanho() {
        if (this.inicio == null) {
            return 0;
        } else {
            int cont = 1;
            Elemento e = this.inicio;
            while (!e.getProximo().getPessoa().equals(this.inicio.getPessoa())) {
                cont++;
                e = e.getProximo();
            }
            return cont;
        }
    }
    
    public boolean vazia() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }
    
    public void listar(){
        Elemento e = this.inicio;
        System.out.println(e.getPessoa());
        while(!e.getProximo().getPessoa().equals(this.inicio.getPessoa())){
            e = e.getProximo();
            System.out.println(e.getPessoa());
        }
        System.out.println(e.getProximo().getPessoa());
    }
    
    public void remover(Pessoa p){
        Elemento e = this.inicio;
        if(e.getPessoa().equals(p)){
            this.inicio = e.getProximo();
            while(!e.getProximo().getPessoa().equals(p)){
                e = e.getProximo();
            }
            e.setProximo(this.inicio);
        }else{
            while(!e.getProximo().getPessoa().equals(this.inicio.getPessoa())){
                if(!e.getProximo().getPessoa().equals(p)){
                    e = e.getProximo();
                }else{
                    e.setProximo(e.getProximo().getProximo());
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
            while (!e.getProximo().getPessoa().equals(this.inicio.getPessoa())) {
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
