package src;

public class Turma {

    public Turma(){

    }

    public Turma( Professores nivelGraduacao, Professores qtdalunos ) {
    }

    public void verificaRequisito(String nivelGraduacao, int alunos){
        if (nivelGraduacao.equals("Doutorado")) {
            System.out.println("O professor Pode assumir a turma");
        } else if ((alunos <=40) && (nivelGraduacao.equals("Mestrado"))){
            System.out.println("O professor Pode assumir a turma");
        }else if ((alunos<= 20) && (nivelGraduacao.equals("Licenciatura"))) {
            System.out.println("O professor Pode assumir a turma");
        }else{
            System.out.println("O professor não pode assumir a turma");
        }
    }
}
