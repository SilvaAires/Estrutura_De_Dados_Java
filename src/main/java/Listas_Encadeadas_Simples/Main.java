package Listas_Encadeadas_Simples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner e = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n-------------- LISTA ENCADEADA -------------");
            System.out.println("-----------------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Inserir Elementos");
            System.out.println("-> 2 - Listar Elementos");
            System.out.println("-> 3 - Remover Elementos");
            System.out.println("-> 4 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
                case 1:
                    Pessoa p = new Pessoa();
                    e = new Scanner(System.in);
                    System.out.print("Digite o nome: ");
                    p.setNome(e.nextLine());
                    System.out.print("Digite o sobrenome: ");
                    p.setSobrenome(e.nextLine());
                    System.out.print("Digite o cpf: ");
                    p.setCpf(e.nextLine());
                    System.out.print("Digite a DN: ");
                    p.setDn(e.nextLine());
                    lista.adicionar(p);
                    break;

                case 2:
                    if (!lista.vazia()) {
                        lista.listar();
                    } else {
                        System.out.println("Lista Vazia.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o cpf a remover: ");
                    e = new Scanner(System.in);
                    if (lista.remover(e.next())) {
                        System.out.println("Elemento Removido.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;

                default:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;
            }
        }
    }

}
