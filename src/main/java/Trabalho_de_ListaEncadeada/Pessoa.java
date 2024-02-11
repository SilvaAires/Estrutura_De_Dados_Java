package Trabalho_de_ListaEncadeada;

public class Pessoa {
    private String Nome;
    private int Idade;
    private String endereco;
    
    public Pessoa(String Nome, int Idade, String endereco) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.Nome + "\n" + this.Idade + "\n" + this.endereco;
    }
}