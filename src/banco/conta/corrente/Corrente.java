package banco.conta.corrente;

public interface Corrente{
    public void corrente(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo);
}