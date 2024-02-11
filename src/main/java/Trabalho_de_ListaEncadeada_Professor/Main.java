package Trabalho_de_ListaEncadeada_Professor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static Scanner e = new Scanner(System.in);	
	public static void main(String[] args) {
		Arquivo dados = new Arquivo();
		ListaEncadeada pessoas = new ListaEncadeada();
		boolean carregado = false;                      
        int opcao = 0;
        cls(false);
        while(opcao != 8) {        	
            System.out.println("\n-------------- TRABALHO PRÁTICO 2 -------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Carregar dados do arquivo");
            System.out.println("-> 2 - Gravar registros no arquivo");
            System.out.println("-> 3 - Inserir novo registro");
            System.out.println("-> 4 - Listar registros");
            System.out.println("-> 5 - Buscar registro por nome");
            System.out.println("-> 6 - Imprimir quantidade de registros");
            System.out.println("-> 7 - Deletar registro por nome");
            System.out.println("-> 8 - Sair");
            System.out.print("-> Opção: ");
            
            // Tratamento de exceção para leitura de inteiros....
            String linha = e.nextLine(); // ler a linha (termina no enter)
            try{
                opcao = Integer.parseInt(linha); // (tenta converter pra int os dados inseridos)                
            } catch(Exception e){
                opcao = 0;
            }
            
            cls(false);
            
            switch (opcao) {
            case 1:
            	if(!pessoas.vazia()) {
            		cls(false);
            		System.out.println("Sobrescrever a lista atual de Registros com os dados gravados no arquivo? (s/n): ");
            		if(e.next().equals("s")){
            			pessoas = dados.ler();
            		}
            	}else {
            		pessoas = dados.ler();
            	}
                if(!pessoas.vazia()) {
                	System.out.println("Registros carregados com sucesso!");
            		cls(true);                	
                }else {
                	System.out.println("Arquivo de Registros vazio!");
            		cls(true);
                }
                carregado = true;
                break;

            case 2:
            	if(dados.gravar(pessoas)) {
            		System.out.println("Registros salvos com sucesso!");
            		cls(true);
            	}else {            		
            		System.out.println("Tentativa de gravar um Arquivo de Registros vazio!");
            		cls(true);
            	}                
                break;
           
            case 3:
                if(!carregado) {
                	System.out.println("Antes de adicionar um Registro, carregue os dados do arquivo com a opção 1!");
            		cls(true);
                }else {
                	System.out.println("Digite os dados do novo registro:");
                	e = new Scanner(System.in);
                	Pessoa p = new Pessoa();
                	System.out.print("Nome: ");
                	p.setNome(e.nextLine());
                	System.out.print("Idade: ");
                	linha = e.nextLine(); // ler a linha (termina no enter)
                	int idade = 0;
                	// Tratamento de exceção para leitura de inteiro...
                    try{
                        idade = Integer.parseInt(linha); // (tenta converter pra int os dados inseridos)                
                    } catch(Exception e){
                    	System.out.println("Idade deve ser número inteiro. Operação cancelada.");
                    	cls(true);
                        break;
                    }         
                	p.setIdade(idade);
                	e = new Scanner(System.in);
                	System.out.print("Endereço: ");
                	p.setEndereco(e.nextLine());
                	pessoas.adicionar(p);
                	cls(false);
                	System.out.println("Registro Adicionado com Sucesso!");
                	cls(true);
                }
                break;
            case 4:
            	if(!pessoas.vazia()) {
            		System.out.println("Listagem de Registros:\n");
            		pessoas.listar();
            		cls(true);
            	}else {
                	System.out.println("Lista de Registros vazia!");
                	cls(true);
                }
            	break;
            
            case 5:
            	if(!pessoas.vazia()) {
            		e = new Scanner(System.in);
            		System.out.print("Nome da Pessoa a ser buscada: ");
            		Pessoa p = pessoas.buscar(e.nextLine());
            		if(p != null) {
            			cls(false);
            			System.out.println("Registro Encontrado:\n" + p);
            			cls(true);
            		}else {
            			cls(false);
            			System.out.println("Registro não encontrado");
            			cls(true);
            		}
            	}else {
                	System.out.println("Lista de Registros vazia!");
                	cls(true);
                }
            	break;
            
            case 6:
            	System.out.println("Quantidade de Registros: " + pessoas.tamanho());
            	cls(true);
            	break;
            	
            case 7:
            	if(!pessoas.vazia()) {
            		e = new Scanner(System.in);
            		System.out.print("Nome da Pessoa a ser removida: ");            		
            		if(pessoas.remover(e.nextLine())){
            			cls(false);
            			System.out.println("Registro Removido!");
            			cls(true);
            		}else {
            			cls(false);
            			System.out.println("Registro não encontrado");
            			cls(true);
            		}
            	}else {
            		System.out.println("Lista de Registros vazia!");
            		cls(true);
            	}
            	break;
            	
            case 8:
            	System.exit(0);
            	
            default:
                System.out.println("Opção Inválida!");
                cls(true);
                break;
            }   
        }    	
	}
	
	private static void cls(boolean enter) {
		if(enter) {
			System.out.println("\n\nPressione ENTER para continuar...\n");
			e = new Scanner(System.in);
			e.nextLine();
			System.out.print("\n");
		}		
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

