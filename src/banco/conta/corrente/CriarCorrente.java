package banco.conta.corrente;

public class CriarCorrente implements Corrente{
    @Override
    public void corrente(boolean usuario, boolean tipo, int agencia, int conta, String nome, int cpf, double saldo){
        agencia++;
        conta++;
        System.out.println("Conta Corrente Criada com Sucesso! Agência " + agencia + ", Conta " + conta + ", Nome " + nome + ", CPF " + cpf + ", Saldo " + saldo);
    }
}