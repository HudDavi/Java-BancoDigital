package banco.conta.poupanca.servico;

public interface ServicoPoupanca{
    public void servico(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo);
}