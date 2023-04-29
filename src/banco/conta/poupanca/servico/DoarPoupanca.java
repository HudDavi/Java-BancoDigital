package banco.conta.poupanca.servico;

public class DoarPoupanca implements ServicoPoupanca{
    @Override
    public void servico(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        System.out.println("Doação Conta Poupança realizado com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}