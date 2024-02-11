package Exemplos_02_27_23;

import java.util.Scanner;

public class ex_01_e_02 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("DIGITE UM TEXTO OU PALAVRA");
        String txt = e.nextLine();
        char vetor [] = txt.toCharArray();
        char vetor1 [] = {'A', 'E', 'I', 'O', 'U'};
        int a = 0;
        int espasos = 0;
        for (int i = 0; i > vetor.length; i++){
            if (i == ' '){
                espasos ++;
            }
            for (int j = 0; i > vetor.length; i++){
                if(vetor[i] == vetor1[j]){
                    a ++;
                    break;
                }
            }
        }
        System.out.println("Quantidade de vogais: " + a);
	System.out.println("Quantidade de consoantes: " + (vetor.length - a - espasos));
        /*
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
        */
    }
}
