package Trabalho_de_ListaEncadeada_Professor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class Arquivo {
	private BufferedReader br;	
	private String arquivo;
	
	public Arquivo(){
		this.arquivo = "registro.dat";
	}
	
	public boolean gravar(ListaEncadeada pessoas){
		if(!pessoas.vazia()) {
			try{
				PrintStream out = new PrintStream(new File(this.arquivo));
				PrintStream saidaPadrao = System.out;
				System.setOut(out);
				pessoas.listar();
				System.setOut(saidaPadrao);
				return true;
			}catch (Exception e) {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public ListaEncadeada ler(){
		ListaEncadeada pessoas = new ListaEncadeada();
		String nome = "";
		int idade = 0;
		String endereco = "";
		try{
			br = new BufferedReader(new FileReader(this.arquivo));
			while((nome = br.readLine()) != null){
				idade = Integer.parseInt(br.readLine());
				endereco = br.readLine();
				Pessoa c = new Pessoa(nome, idade, endereco);
				pessoas.adicionar(c);
			}
			br.close();
		}catch (Exception e) {
			return pessoas;
		}
		return pessoas;
	}
}

