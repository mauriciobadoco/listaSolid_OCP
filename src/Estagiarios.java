package src;

public abstract class Estagiarios implements Reembolso {

    private String professorEstagiario;
    private String nome;

    private double bolsa;

    public Estagiarios(String professorEstagiario, String nome, double bolsa) {
        this.professorEstagiario = professorEstagiario;
        this.nome = nome;
        this.bolsa = bolsa;
    }

    @Override
    public double calculoReembolso() {
        System.out.println(" o reembolso do ESTAGIARIO foi efetuado com Sucesso");
        return 0;
    }
    public String getProfessorEstagiario() {
        return professorEstagiario;
    }

    public void setProfessorEstagiario(String professorEstagiario) {
        this.professorEstagiario = professorEstagiario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

}