package banco.conta;

public interface Conta{
    public void conta(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo, String operacao);
}