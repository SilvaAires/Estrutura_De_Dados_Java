package Trabalho_de_ListaEncadeada;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Arquivo dados = new Arquivo();
        ListaEncadeada pessoa = new ListaEncadeada();
        Scanner e = new Scanner(System.in);
        int opcao = 0;
        boolean carregou = false;
        while (opcao != 8) {
            System.out.println("\n-------------- trabalho pratico 2 -------------");
            System.out.println("-----------------------------------------");
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
            opcao = e.nextInt();
            switch (opcao) {
                case 1:
                    carregou = true;
                    if(!pessoa.vazia()){
                        pessoa = dados.ler();
                        System.out.println("Resgistros carregados com sucesso!");
                    }else{
                        pessoa = dados.ler();
                        System.out.println("Arquivo de registro vazio!");
                    }
                    break;

                case 2:
                    if(!pessoa.vazia()){
                        dados.gravar(pessoa);
                        System.out.println("Registros salvos com sucesso!");
                    }else{
                        System.out.println("Tentativa de gravar um arquivo de registro vazio!");
                    }
                    break;

                case 3:
                    Pessoa p = new Pessoa();
                    if (carregou) {
                        e = new Scanner(System.in);
                        System.out.print("Digite o nome: ");
                        p.setNome(e.nextLine());
                        System.out.print("Digite o endereço: ");
                        p.setEndereco(e.nextLine());
                        System.out.print("Digite a idade: ");
                        p.setIdade(e.nextInt());
                        pessoa.adicionar(p);
                    } else {
                        System.out.println("Erro");
                    }
                    break;
                
                case 4:
                    if (!pessoa.vazia()) {
                        pessoa.listar();
                    } else {
                        System.out.println("Lista Vazia.");
                    }
                    break;
                    
                case 5:
                    if (!pessoa.vazia()){
                        e = new Scanner (System.in);
                        System.out.println("Nome da pessoa a ser buscada: ");
                        p = pessoa.buscar(e.nextLine());
                        if (p != null){
                            System.out.println("Registro encontrado: \n" + p);
                        }else {
                            System.out.println("Registro não encontrado");
                        }
                    }else{
                        System.out.println("Lista de registros vazia!");
                    }
                    break;
                    
                case 6:
                    if (!pessoa.vazia()) {
                        System.out.println("Tamanho: "+ pessoa.tamanho());
                    }
                    break;
                    
                case 7:
                    System.out.print("Digite o nome a remover: ");
                    e = new Scanner(System.in);
                    if (pessoa.remover(e.next())) {
                        System.out.println("Elemento Removido.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;
                    
                case 8:
                    System.exit(0);
                    break;    
             
                default:
                    System.out.println("\nOpação inválida\n");
                    break;
            }
        }
    }

}