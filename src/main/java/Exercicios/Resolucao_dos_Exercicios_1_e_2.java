package Exercicios;

import java.util.Scanner;

public class Resolucao_dos_Exercicios_1_e_2 {
    public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		int contVogais = 0;
		int contSpaces = 0;
		System.out.print("Digite uma frase: ");
		String frase = e.nextLine();
		
		char vetFrase[] = frase.toCharArray();
//		for (char c : vetFrase) {
//			if(c == ' ') {
//				contSpaces ++;
//			}
//			for(char v : vogais) {
//				if(v == c) {
//					contVogais++;					
//					break;
//				}
//			}
//		}
		
		for(int i = 0; i<vetFrase.length; i++) {
			if(vetFrase[i] == ' ') {
				contSpaces++;
			}
			for(int j = 0; j<vogais.length; j++) {
				if(vetFrase[i] == vogais[j]) {
					contVogais++;
					break;
				}
			}
		}
		
		System.out.println("Quantidade de vogais: " + contVogais);
		System.out.println("Quantidade de consoantes: " + (frase.length() - contVogais - contSpaces));
    }
}
        