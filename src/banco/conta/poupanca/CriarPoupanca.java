package banco.conta.poupanca;

public class CriarPoupanca implements Poupanca{
    @Override
    public void poupanca(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        agencia++;
        conta++;
        System.out.println("Conta Poupança Criada com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}