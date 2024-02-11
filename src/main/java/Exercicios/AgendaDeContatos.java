package Exercicios;

import java.util.Scanner;

public class AgendaDeContatos {
    static String contatos[] = new String[40];
	static int contador = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op = -1;
		while(true) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("0 - Inserir");
			System.out.println("1 - Listar");
			System.out.println("2 - Buscar");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			System.out.print("------> ");
			op = Integer.parseInt(entrada.nextLine());
			
			switch (op) {
			case 0:
				inserir();
				break;
			case 1:
				listar();
				break;
			case 2:
				buscar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				excluir();
				break;
			default:
				System.exit(0);
				break;
			}
		}		
	}
	
	
	public static void excluir() {
		int c = buscar();
		if(c != -1) {
			System.out.print("Excluir contato? (s/n): ");
			String r = entrada.nextLine();
			if(r.equals("s")) {				
				contatos[c] = "0";								
				contatos[c+1] = "0";			
			}
		}
		
	}
	
	public static void alterar() {
		int c = buscar();
		if(c != -1) {
			System.out.print("Alterar nome? (s/n): ");
			String r = entrada.nextLine();
			if(r.equals("s")) {
				System.out.print("Digite o novo nome do contato: ");
				contatos[c] = entrada.nextLine();			
			}
			System.out.print("Alterar email? (s/n): ");
			r = entrada.nextLine();
			if(r.equals("s")) {
				System.out.print("Digite o novo email do contato: ");
				contatos[c+1] = entrada.nextLine();			
			}
		}
	}
	
	public static int buscar() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("Digite o nome do contato: ");
		String nome = entrada.nextLine();
		nome = nome.toLowerCase();
		for(int i = 0; i<contador; i+=2) {
			if(nome.equals(contatos[i].toLowerCase())){
				System.out.println("Nome: " + contatos[i] + " - Email: " + contatos[i+1]);
				return i;
			}
		}
		System.out.println("Contato não encontrado!");
		return -1;
	}
	
	public static void inserir() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("Digite o nome do contato: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o email do contato: ");
		String email = entrada.nextLine();
		contatos[contador] = nome;
		contatos[contador+1] = email;
		contador+=2;
	}
	
	public static void listar() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("-------------            AGENDA DE CONTATOS        -----------------------");
		System.out.println("--------------------------------------------------------------------------");
		for(int i = 0; i < contador; i+=2) {
			if(contatos[i] != "0") {
				System.out.println("Nome: " + contatos[i] + " - Email: " + contatos[i+1]);
			}
		}
		System.out.println("--------------------------------------------------------------------------");
	}
}
