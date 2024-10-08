public class FuncionarioEnsinoBasico  extends Funcionario{
    private String escola;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() * 1.10;
    }
}
