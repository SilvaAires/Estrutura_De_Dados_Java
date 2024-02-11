package Trabalho_de_ListaEncadeada_Professor;



public class ListaEncadeada {

	private Elemento inicio;

	public void adicionar(Pessoa pessoa){
		if (this.inicio == null){
			this.inicio = new Elemento(pessoa);
		}else{
			Elemento elemento = this.inicio;
			while (elemento.getProximo() != null){
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(pessoa));
		}
	}
	
	public int tamanho() {
		int tam = 0;
		if(!vazia()) {
			Elemento elemento = this.inicio;
			tam++;
			while(elemento.getProximo() != null){
				elemento = elemento.getProximo();
				tam++;				
			}
			return tam;
		}else {
			return tam;
		}
	}
	
	public boolean vazia() {
		if(this.inicio == null) {
			return true;
		}
		return false;
	}

	public void listar(){
		if(!vazia()) {
			Elemento elemento = this.inicio;
			System.out.println(elemento);
			while(elemento.getProximo() != null){
				elemento = elemento.getProximo();
				System.out.println(elemento);
			}
		}
	}
	
	public Pessoa buscar(String nome){
		if(!vazia()) {
			Elemento elemento = this.inicio;
			if (elemento.getPessoa().getNome().equals(nome)){
				return elemento.getPessoa();
			}else{
				while(elemento.getProximo() != null){
					elemento = elemento.getProximo();
					if (elemento.getPessoa().getNome().equals(nome)){
						return elemento.getPessoa();
					}
				}
			}
			return null;
		}
		return null;
	}
	
	public boolean remover(String nome){
		Elemento elemento = this.inicio;
		if (elemento.getPessoa().getNome().equals(nome)){
			this.inicio = elemento.getProximo();
			return true;
		}else{
			while(elemento.getProximo() != null){
				if(elemento.getProximo().getPessoa().getNome().equals(nome)){
					elemento.setProximo(elemento.getProximo().getProximo());
					return true;
				}else{
					elemento = elemento.getProximo();
				}
			}
		}
		return false;
	}		
}


