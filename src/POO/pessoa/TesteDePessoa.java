package POO.pessoa;

public class TesteDePessoa {



    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("33322222111");
        professor.setNome("Victor");
        professor.setIdade(20);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("12345678900");
        aluno.setNome("Thayna");
        aluno.setIdade(18);
        aluno.setMatricula("20231370022");

        System.out.println(aluno.imprimirDadosDaPessoa());


    }
}
