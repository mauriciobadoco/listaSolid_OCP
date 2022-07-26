package src;

public abstract class Coordenadores extends Funcionarios{
    private int professoresSupervisionados;

    public Coordenadores(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public Coordenadores(String nome, String CPF, int numRegistro, String orgaoLotacao, double salario, int professoresSupervisionados) {
        super(nome, CPF, numRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }
    @Override
    public double calculoReembolso() {
        System.out.println(" O reembolso DO COODENADOR foi efetuado com Sucesso");
        return 0;
    }
    public double aumentoSalario(){
        double salAtual = 0;
        salAtual = this.getSalario() *1.05;
        return salAtual;
    }
    public void adicionaProfessor(){
        if( this.professoresSupervisionados <= 15){
            this.professoresSupervisionados += 1;
            System.out.println("Novo professor adicionado: " + this.professoresSupervisionados);
        }else {
            System.out.println("A quantidade de professores supervisionados atingiu o limite");
        }

    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
