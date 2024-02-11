package Listas_Encadeadas_Simples;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String dn;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String cpf, String dn) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dn = dn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nSobrenome: " + this.sobrenome
                + "\nCPF: " + this.cpf + "\nData de Nascimento: " + this.dn
                + "\n";
    }
}
