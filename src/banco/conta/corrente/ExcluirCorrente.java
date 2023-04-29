package banco.conta.corrente;

public class ExcluirCorrente implements Corrente{
    @Override
    public void corrente(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        System.out.println("Conta Corrente Excluída com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}