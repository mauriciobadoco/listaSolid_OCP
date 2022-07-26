package src;

import java.util.ArrayList;

public class Professores extends Funcionarios {

    private String nivelGraduacao;
    private String disciplina;
    private int qtdAlunos;
    private int qtdTurmas;
    private String alunosEstagiarios;
    private ArrayList<String>alunosEstagio = new ArrayList<>();


    public Professores(){

    }

    public Professores(String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas, String alunosEstagiarios) {
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.alunosEstagiarios = alunosEstagiarios;
    }

    public Professores(String nome, String CPF, int numRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas, String alunosEstagiarios) {
        super(nome, CPF, numRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.alunosEstagiarios = alunosEstagiarios;
    }
    @Override
    public double calculoReembolso() {
        System.out.println(" o reembolso DO PROFESSOR foi efetuado com Sucesso");
        return 0;
    }

    public void adicionarEstagiario(String alunosEstagiarios) {
        if (alunosEstagio.size() > 2) {
            System.out.println("Impossível vincular mais estagiários");
        } else {
            alunosEstagio.add(alunosEstagiarios);
            System.out.println(" Estágiário  " +alunosEstagiarios+"  inserido com sucesso");
        }
    }

    public void adicionaTurma (int addTurma){
        this.qtdTurmas =+ addTurma;
        System.out.println(" Turmas do professor: "+ this.qtdTurmas);
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public String getAlunosEstagiarios() {
        return alunosEstagiarios;
    }

    public void setAlunosEstagiarios(String alunosEstagiarios) {
        this.alunosEstagiarios = alunosEstagiarios;
    }
}