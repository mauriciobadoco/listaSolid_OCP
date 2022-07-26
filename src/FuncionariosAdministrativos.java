package src;

public class FuncionariosAdministrativos extends Funcionarios{

    private String funcaoAdministrativa;
    private String senioridade;


    public FuncionariosAdministrativos(String nome, String CPF, int numRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, CPF, numRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }
    @Override
    public double calculoReembolso() {
        System.out.println(" o reembolso DO FUNCIONÁRIO ADMINISTRATIVO foi efetuado com Sucesso");
        return 0;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
