package src;

public abstract class Funcionarios implements Reembolso {
    private String nome;
    private String CPF;
    private int numRegistro;
    private String orgaoLotacao;
    private double salario;


    public Funcionarios() {

    }

    public Funcionarios(String nome, String CPF, int numRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public double aumentoSalario( ){
        double salAtual = 0;
        salAtual = this.getSalario() * 1.1;
        return salAtual;
    }

    public void reembolsoDespesas(){
        System.out.println("O reembolso foi calculado com sucesso");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}