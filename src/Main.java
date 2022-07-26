package src;

public class Main {
    public static void main(String[] args) {
        Professores p1 = new Professores();
        p1.setNome("Fábio");
        p1.setSalario(1000);
        p1.aumentoSalario();
        p1.adicionaTurma(2);
        p1.setNivelGraduacao("Mestrado");
        p1.adicionarEstagiario("Candido");
        p1.calculoReembolso();
        System.out.println("Nome Professor: " + p1.getNome());
        System.out.println("Salário professor: " +p1.getSalario());
        System.out.println("Salário aumentado: " + p1.aumentoSalario());
        System.out.println();

        Coordenadores c1 = new Coordenadores(2) {

        };
        c1.setNome("Pedro");
        c1.setSalario(2000);
        c1.aumentoSalario();
        c1.calculoReembolso();
        System.out.println("Nome Coordenador: " + c1.getNome());
        System.out.println("Salário Coordenador: " +c1.getSalario());
        System.out.println("Salário aumentado: " + c1.aumentoSalario());
        System.out.println();

        FuncionariosAdministrativos a1 = new FuncionariosAdministrativos("Ana","14857985487",12715,"Secretaria",1200,"Auxiliar","Júnior");
        a1.setSalario (500);
        a1.aumentoSalario();
        a1.calculoReembolso();
        System.out.println("Nome Administrativo: " + a1.getNome());
        System.out.println("Salário administrativo: " +a1.getSalario());
        System.out.println("Salário aumentado: " + a1.aumentoSalario());
        System.out.println();

        Turma t1 = new Turma();
        t1.verificaRequisito("Licenciatura", 25);

    }
}
