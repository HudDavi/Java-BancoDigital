package banco.conta.corrente.servico;

public interface ServicoCorrente{
    public void servico(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo);
}