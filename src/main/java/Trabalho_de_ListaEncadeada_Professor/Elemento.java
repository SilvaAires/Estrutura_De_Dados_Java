package Trabalho_de_ListaEncadeada_Professor;



public class Elemento {
	
	private Pessoa pessoa;	
	private Elemento proximo ;
	
	public Elemento(){}
	
	public Elemento(Pessoa contato) {
		this.pessoa = contato;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa contato) {
		this.pessoa = contato;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		return pessoa.toString();
	}
	
}

