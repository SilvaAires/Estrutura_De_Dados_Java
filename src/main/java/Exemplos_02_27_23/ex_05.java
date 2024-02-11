package Exemplos_02_27_23;

//* 5) Implementar, usando um vetor, uma agenda de contatos. Na agenda é possível cadastrar, excluir, alterar, e buscar contato.

import java.util.Scanner;


public class ex_05 {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite os numeros para adicionar em contatos");
        int vetor[] = new int[10];       
        int opcao = 0;
        while(opcao != 5) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - cadastrar");
            System.out.println("-> 2 - excluir");
            System.out.println("-> 3 - alterar");
            System.out.println("-> 4 - buscar contato");
            System.out.println("-> 5 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            case 1:
                for(int i=0; i<vetor.length; i++) {
                    System.out.print("Digite os numeros que queria armazenar no vetor, na posição " + i + ": ");
                    vetor[i] = e.nextInt();
                }   
                break;

            case 2:
                System.out.println("\nexcluir");
                System.out.print("Digite o numero que queira excluir: ");
                int ex = e.nextInt();
                vetor[ex] = 0;
                break;
           
            case 3:
                System.out.println("\nAlterar numero");
                System.out.print("Digite o numero que queira alterar: ");
                int al = e.nextInt();
                System.out.print("Digite o novo numero: ");
                int novo = e.nextInt();
                vetor[al] = novo;
                System.out.print("Novo numero: " + vetor[al]);
                break;
            
            case 4:
                System.out.println("\nBuscar contato");
                System.out.print("Digite o numero que queira buscar: ");
                int bus = e.nextInt();
                System.out.print("Numero de busca: " + vetor[bus]);
                break;
                
            case 5:
                System.out.println("\nSaindo...");
                break;
                
            default:
                System.out.println("\nOpção Inválida\n");
                break;
            }   
        }
    }
}