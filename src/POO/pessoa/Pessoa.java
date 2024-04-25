package POO.pessoa;

public class Pessoa {
    //nome, idade, cpf
    //tipo nomeDaVariavel

    private String nome;
    private int idade;
    private String cpf;

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    String imprimirDadosDaPessoa(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf;
    }
}
