package POO.pessoa;

public class Professor extends Pessoa{

    private double salario;

    //Getters e Setters - salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Sobrescreveu
    String imprimirDadosDaPessoa(){
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é professor";
    }
}
