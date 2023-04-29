package banco.conta.poupanca;

public class ExcluirPoupanca implements Poupanca{
    @Override
    public void poupanca(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        System.out.println("Conta Poupança Excluída com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}