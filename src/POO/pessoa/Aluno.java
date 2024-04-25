package POO.pessoa;

public class Aluno extends Pessoa{

    private String matricula;

    //Getters e Setter Matricula
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Sobrescreveu
    String imprimirDadosDaPessoa(){
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é aluno";
    }




}
