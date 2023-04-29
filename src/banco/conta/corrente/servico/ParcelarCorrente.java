package banco.conta.corrente.servico;

public class ParcelarCorrente implements ServicoCorrente{
    @Override
    public void servico(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        System.out.println("Parcelamento Conta Corrente realizado com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}