package Exercicios;

import java.util.Scanner;

public class Criptografia_e_Descriptografia {
    public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite a frase a ser criptografada: ");
		String frase = e.nextLine();
		
		char tabela[] = tabelaAscii();
		String fraseCriptografada = criptografar(frase, tabela);
		
		System.out.println("Frase Criptografada: " + fraseCriptografada);
		
		String fraseDescriptografada = descriptografar(fraseCriptografada, tabela);
		System.out.println("Frase Descriptografada: " + fraseDescriptografada);
	}
	
	public static String descriptografar(String frase, char[] tabela) {
		String fraseDescriptografada = "";
		char vetFrase[] = frase.toCharArray();
		for(int i = 0; i<vetFrase.length; i++) {
			for(int j = 0; j<tabela.length; j++) {
				if(vetFrase[i] == tabela[j]) {
					if(j > 1) {
						vetFrase[i] = tabela[j-1];
					}else {
						vetFrase[i] = tabela[tabela.length-1];
					}
					break;
				}
			}
		}		
		for (char c : vetFrase) {
			fraseDescriptografada+=c;
		}		
		return fraseDescriptografada;
	}
	
	public static String criptografar(String frase, char[] tabela) {
		String fraseCriptografada = "";
		char vetFrase[] = frase.toCharArray();
		for(int i = 0; i<vetFrase.length; i++) {
			for(int j = 0; j<tabela.length; j++) {
				if(vetFrase[i] == tabela[j]) {
					if(j < tabela.length-1) {
						vetFrase[i] = tabela[j+1];
					}else {
						vetFrase[i] = tabela[0];
					}
					break;
				}
			}
		}		
		for (char c : vetFrase) {
			fraseCriptografada+=c;
		}		
		return fraseCriptografada;
	}
	
	public static char[] tabelaAscii() {
		char tabela[] = new char[256];
		for(int i=0; i<tabela.length; i++) {
			tabela[i] = (char) i;
		}		
		return tabela;
	}
	
	public static void imprimirTabelaAscii(char[] tabela) {
		for(int i = 0; i<tabela.length; i++) {
			System.out.println("Posição " + i + ": " + tabela[i]);
		}
	}
}
