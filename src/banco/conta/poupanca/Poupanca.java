package banco.conta.poupanca;

public interface Poupanca{
    public void poupanca(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo);
}