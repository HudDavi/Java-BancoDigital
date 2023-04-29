package banco.conta.poupanca.servico;

public class VerificarPoupanca implements ServicoPoupanca{
    @Override
    public void servico(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo) {
        System.out.println("Consulta de Saldo Conta Poupança realizada com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}