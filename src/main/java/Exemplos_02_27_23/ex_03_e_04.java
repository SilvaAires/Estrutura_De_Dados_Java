package Exemplos_02_27_23;

/*
3) Implementar um programa que faça a criptografia simples de uma frase, 
substituindo a letra corrente pela letra seguinte do alfabeto.
4) Implementar um programa que faça a descriptografia simples de uma frase,
substituindo a letra corrente pela letra anterior do alfabeto.
*/

import java.util.Scanner;

public class ex_03_e_04 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        char alfa [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','o','r','s','t','u','v','w','x','y','z'};
        System.out.println("Digite uma frase ou letra: ");
        String txt = e.nextLine();
        String a = txt.toLowerCase();
        char vetor [] = a.toCharArray();
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < alfa.length; j++){
                if (vetor [i] == alfa[j]){
                    vetor [i] = alfa [j+1];
                    break;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Nova frase ou palavra: \n" + vetor[i]);
        }
        
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < alfa.length; j++){
                if (vetor [i] == alfa[j]){
                    vetor [i] = alfa [j-1];
                    break;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Nova frase ou palavra arrumada: \n" + vetor[i]);
        }
        //do Professor.
        
        String frase = "Hoje e terça feira de março";
        //imprimir(tabelaAscii());
        System.out.println(crip(frase,tabelaAscii()));
    }
    public static String crip(String frase, char []tabela){
        String frasecrip = "";
        char vet []= frase.toCharArray();
        for (int i = 0; i<vet.length;i++){
            for (int j = 0; j<tabela.length;j++){
                if (vet[i] == tabela[j]){
                    if(j < tabela.length-1){
                        vet[i] = tabela [j+1];
                        break;
                    }
                    else{
                        vet[i] = tabela[0];
                        break;
                    }
                }
            }
        }
        for (char c : vet){
            frasecrip+=c;
        }
        return frasecrip;
    }
    
    public static char[] tabelaAscii(){
        char tabela []=new char[256];
        for (int i = 0; i<tabela.length; i++){
            tabela[i] =(char)i;
        }
        return tabela;
    }
    
    public static void imprimir(char[] tabela){
        for(int i = 0; i<tabela.length;i++){
            System.out.println("Posicao: "+ i + " : "+ tabela[i]);
        }
    }
}